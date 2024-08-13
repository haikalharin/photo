package com.paem.core.entities

import kotlinx.serialization.SerialName

data class Photo(
    val albumId: Int,
    val id: Int ,
    val title: String,
    val url: String ,
    val thumbnailUrl: String
)