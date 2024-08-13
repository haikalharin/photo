package com.haikal.photos.presentation.user

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import com.haikal.photos.R

class PasswordDialogFragment(private val onPasswordEntered: (String) -> Unit) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("Enter Admin Password")
            .setView(R.layout.dialog_password)
            .setPositiveButton("OK") { _, _ ->
                val passwordInput = dialog?.findViewById<EditText>(R.id.passwordInput)
                val password = passwordInput?.text.toString()
                onPasswordEntered(password)
            }
            .setNegativeButton("Cancel", null)
            .create()
    }
}
