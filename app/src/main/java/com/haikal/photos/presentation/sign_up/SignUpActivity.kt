package com.haikal.photos.presentation.sign_up

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.haikal.photos.databinding.ActivitySignUpBinding
import com.haikal.photos.datasource.local.model.User
import com.haikal.photos.utils.gone
import com.haikal.photos.utils.show
import com.haikal.photos.utils.showToast
import org.koin.androidx.viewmodel.ext.android.viewModel

class SignUpActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private val viewModel: SignUpViewModel by viewModel()

    private lateinit var role: String
    private val roles = arrayListOf("User", "Admin")

    private val binding by lazy { ActivitySignUpBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        with(binding) {
            setupSpinner()

            btnSignUp.setOnClickListener {
                val user = User(
                    username = edtUsername.text.toString(),
                    email = edtEmail.text.toString(),
                    password = edtPassword.text.toString(),
                    role = role
                )
                signUp(user)
            }
        }
    }

    private fun ActivitySignUpBinding.setupSpinner() {
        spinnerRole.onItemSelectedListener = this@SignUpActivity
        val ad = ArrayAdapter(this@SignUpActivity, R.layout.simple_spinner_item, roles)
        ad.setDropDownViewResource(
            R.layout
                .simple_spinner_dropdown_item
        )
        spinnerRole.setAdapter(ad)
    }

    private fun signUp(user: User) {
        viewModel.insertUser(user) { state ->
            when (state) {
                is SignUpState.Error -> {
                    showToast(state.errMsg)
                    hideProgressbar()
                }
                SignUpState.Loading -> showProgressbar()
                is SignUpState.Success -> {
                    showToast(state.msg)
                    hideProgressbar()
                    finish()
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

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        role = roles[position]
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        role = "User"
    }
}