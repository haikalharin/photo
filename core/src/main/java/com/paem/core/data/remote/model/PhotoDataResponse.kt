package com.paem.core.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PhotoDataResponse(
	val photoDataResponse: List<PhotoDataResponseItem>
)
@Serializable
data class PhotoDataResponseItem(
	@SerialName("albumId")
	val albumId: Int? = null,
	@SerialName("id")
	val id: Int? = null,
	@SerialName("title")
	val title: String? = null,
	@SerialName("url")
	val url: String? = null,
	@SerialName("thumbnailUrl")
	val thumbnailUrl: String? = null
)

