package com.paem.core.data

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.paem.core.base.BaseRepository
import com.paem.core.data.datasource.PhotoListDatasource

import com.paem.core.entities.Photo

class PhotosRepository : BaseRepository() {

    fun getPhoto(): LiveData<PagingData<Photo>> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                enablePlaceholders = false,
                initialLoadSize = 2
            ),
            pagingSourceFactory = {
                PhotoListDatasource( network)
            }
            , initialKey = 1
        ).liveData
    }




}