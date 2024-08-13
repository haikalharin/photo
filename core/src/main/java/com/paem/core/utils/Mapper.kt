package com.paem.core.utils

import com.paem.core.data.remote.model.PhotoDataResponseItem
import com.paem.core.entities.Photo


fun PhotoDataResponseItem.toPhoto(): Photo {
    return Photo(
        albumId = albumId ?: 0,
        id = id ?: 0,
        title = title ?: "",
        url = url ?: "",
        thumbnailUrl = thumbnailUrl ?: "",

        )
}

