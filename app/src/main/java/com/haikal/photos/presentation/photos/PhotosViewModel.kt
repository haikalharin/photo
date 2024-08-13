package com.haikal.photos.presentation.photos

import androidx.lifecycle.*
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.paem.core.base.BaseViewModel
import com.paem.core.data.PhotosRepository
import com.paem.core.entities.Photo

class PhotosViewModel  : BaseViewModel() {
    private val repo = PhotosRepository()

    fun getPhotoPagination(): LiveData<PagingData<Photo>> {
        return repo.getPhoto().cachedIn(viewModelScope)
    }

}