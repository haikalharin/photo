package com.haikal.photos.presentation.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.haikal.photos.MainActivity
import com.haikal.photos.R
import com.haikal.photos.presentation.admin.AdminActivity
import com.haikal.photos.databinding.ActivityLoginBinding
import com.haikal.photos.datasource.local.model.User
import com.haikal.photos.presentation.photos.PhotosActivity
import com.haikal.photos.presentation.sign_up.SignUpActivity
import com.haikal.photos.presentation.user.UserActivity
import com.haikal.photos.utils.gone
import com.haikal.photos.utils.show
import com.haikal.photos.utils.showToast
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val viewModel: LoginViewModel by viewModel()

    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        with(binding) {
            btnLogin.setOnClickListener {
                val email = edtEmail.text.toString()
                val password = edtPassword.text.toString()
                observeLogin(email, password)
            }

            tvRegisterHere.setOnClickListener {
                startActivity(Intent(this@LoginActivity, SignUpActivity::class.java))
            }
        }
    }

    private fun observeLogin(username: String, password: String) {
        viewModel.getUser(username, password) { state ->
            when (state) {
                is LoginState.Error -> {
                    showToast(state.errMsg)
                    hideProgressbar()
                }
                LoginState.Loading -> showProgressbar()
                is LoginState.Success -> {
                    val role = state.user.mapRole(state.user.role)
                    when (role) {
                        User.Role.ADMIN -> {
                            // Get SharedPreferences
                            val sharedPref = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE)

                            // Save data
                            val editor = sharedPref.edit()
                            editor.putString("username", state.user.username)
                            editor.putString("password", state.user.password)
                            editor.apply()

                            //navigate to admin
                            startActivity(Intent(this, UserActivity::class.java))
                            finish()
                        }
                        User.Role.USER -> {
                            //navigate to user
                            startActivity(Intent(this, PhotosActivity::class.java))
                            finish()
                        }
                        User.Role.UNDEFINED -> {
                            showToast("User undefined")
                        }
                    }
                    hideProgressbar()
                }
            }
        }
    }

    private fun showProgressbar() {
        with(binding) { progressBar.show() }
    }

    private fun hideProgressbar() {
        with(binding) { progressBar.gone() }
    }
}