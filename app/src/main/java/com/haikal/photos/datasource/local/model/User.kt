package com.haikal.photos.datasource.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val username: String,
    val email: String,
    val password: String,
    val role: String
) {

    fun mapRole(role: String): Role {
        return when (role) {
            "Admin" -> Role.ADMIN
            "User" -> Role.USER
            else -> Role.UNDEFINED
        }
    }

    enum class Role {
        ADMIN, USER, UNDEFINED
    }
}
