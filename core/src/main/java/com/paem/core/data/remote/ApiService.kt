package com.paem.core.data.remote


import com.paem.core.data.remote.model.PhotoDataResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("photos")
    suspend fun getPhotos(
        @Query("_page") page: Int? = 1,
        @Query("_limit") perPage: Int? = 10,
    ): Response<List<PhotoDataResponseItem>>


}