package com.haikal.photos.presentation.user

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.GridLayoutManager

import com.haikal.photos.R
import com.haikal.photos.databinding.ActivityUserBinding
import com.haikal.photos.datasource.local.model.User
import com.haikal.photos.presentation.login.LoginActivity

import com.haikal.photos.utils.gone

import com.paem.core.utils.show
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter
    private val vm: UserViewModel by viewModel()


    private val binding by lazy { ActivityUserBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        userAdapter = UserAdapter(::userClick, ::updateUser, ::deleteUser)
        observeViewModel()
        setSupportActionBar(binding.toolBar)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_logout -> {
                // Handle logout action here
                logoutUser()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun logoutUser() {
        // Clear user session, redirect to login, etc.
        Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show()

        val sharedPreferences = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
        val intent = Intent(this, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }

    private fun observeViewModel() = with(binding) {
        vm.getAllUser { state ->
            when (state) {
                UserState.Loading -> progressBar.show()
                is UserState.Success -> {
                    progressBar.gone()
                    showUserList(state.result)
                }

                is UserState.Error -> {
                    progressBar.gone()
                }

            }
        }
    }


    private fun showUserList(genreList: List<User>) {
        with(binding) {
            userAdapter.addItems(genreList)
            recyclerView.apply {
                layoutManager = GridLayoutManager(this@UserActivity, 1)
                adapter = userAdapter
            }
        }
    }

    private fun userClick(user: User) {
        // Update user logic here
//        Toast.makeText(this, "Update: ${user.username}", Toast.LENGTH_SHORT).show()
    }

    private fun updateUser(user: User) {
        // Update user logic here
        Toast.makeText(this, "Update: ${user.username}", Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun deleteUser(user: User) = with(binding) {
        // Prompt for admin password before deleting
        val passwordDialog = PasswordDialogFragment { password ->
            if (verifyPassword(password)) {
                val sharedPref = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE)

                val username = sharedPref.getString("username", null)
                if (username != user.username) {
                    vm.deleteUser(user) { state ->
                        when (state) {
                            is UserState.Success -> {
                                userAdapter.notifyDataSetChanged()
                                Toast.makeText(
                                    this@UserActivity,
                                    "Deleted: ${user.username}",
                                    Toast.LENGTH_SHORT
                                ).show()
                                progressBar.gone()
                                observeViewModel()
                            }

                            is UserState.Error -> {
                                progressBar.gone()
                            }

                            UserState.Loading -> {
                                progressBar.show()
                            }
                        }
                    }
                } else {
                    Toast.makeText(this@UserActivity, "cannot delete the account in use", Toast.LENGTH_SHORT).show()

                }
            } else {
                Toast.makeText(this@UserActivity, "Invalid Password", Toast.LENGTH_SHORT).show()
            }
        }
        passwordDialog.show(supportFragmentManager, "PasswordDialog")
    }

    private fun verifyPassword(password: String): Boolean {
        // Simple verification logic
        val sharedPref = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE)

        val username = sharedPref.getString("username", null)
        val passwordUser = sharedPref.getString("password", null)

        return password == passwordUser
    }
}
