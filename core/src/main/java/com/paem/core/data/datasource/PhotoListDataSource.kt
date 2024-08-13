package com.paem.core.data.datasource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.paem.core.data.remote.ApiService
import com.paem.core.entities.Photo
import com.paem.core.utils.toPhoto

class PhotoListDatasource(
    private val network: ApiService
) : PagingSource<Int, Photo>() {

    override fun getRefreshKey(state: PagingState<Int, Photo>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Photo> {
        return try {
            val position = params.key ?: 1
            val response =
                network.getPhotos( page = position, perPage = 10)
            LoadResult.Page(
                data = response.body()!!.photoDataResponse.map { it.toPhoto() },
                prevKey = if (position == 1) null else position - 1,
                nextKey = position + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }


}