package com.paem.core.data.remote

import com.paem.core.data.remote.model.Genres
import com.paem.core.data.remote.model.PhotoResponse
import com.paem.core.data.remote.model.MoviesResponse
import com.paem.core.data.remote.model.PhotoDataResponse
import com.paem.core.data.remote.model.ReviewsResponse
import com.paem.core.data.remote.model.VideosResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("genre/movie/list")
    suspend fun getGenreList(): Response<Genres>

    @GET("photos")
    suspend fun getPhotos(
        @Query("_page") page: Int? = 1,
        @Query("_limit") perPage: Int? = 10,
    ): Response<PhotoDataResponse>


}