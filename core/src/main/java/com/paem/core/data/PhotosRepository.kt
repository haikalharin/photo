package com.paem.core.data

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.paem.core.base.BaseRepository
import com.paem.core.data.datasource.PhotoListDatasource
import com.paem.core.data.remote.NetworkState
import com.paem.core.data.remote.ProcessState
import com.paem.core.data.remote.model.Genres
import com.paem.core.data.remote.stateNetworkCall
import com.paem.core.entities.Photo

class PhotosRepository : BaseRepository() {

    suspend fun getGenres(): ProcessState<Genres> {
        val response =
            stateNetworkCall { network.getGenreList() }
        return if (response is NetworkState.Success) {
            ProcessState.Success(response.result)
        } else {
            ProcessState.Failed(response as NetworkState.Failed)
        }
    }

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