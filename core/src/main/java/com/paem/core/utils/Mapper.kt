package com.paem.core.utils

import com.paem.core.data.remote.model.Genres
import com.paem.core.data.remote.model.MovieDetailsResponse
import com.paem.core.data.remote.model.MovieResponse
import com.paem.core.data.remote.model.PhotoDataResponseItem
import com.paem.core.data.remote.model.ReviewsResponse
import com.paem.core.data.remote.model.VideosResponse
import com.paem.core.entities.Genre
import com.paem.core.entities.Movie
import com.paem.core.entities.MovieDetail
import com.paem.core.entities.Photo
import com.paem.core.entities.Review
import com.paem.core.entities.Video


fun Genres.Genre.toGenre(): Genre {
    return Genre(id = id, name = name)
}

fun PhotoDataResponseItem.toPhoto(): Photo {
    return Photo(
        albumId = albumId?:0,
        id =id?:0,
        title = title?:"",
        url = url?:"",
        thumbnailUrl = thumbnailUrl?:"",

    )
}

fun MovieDetailsResponse.toMovieDetail(): MovieDetail {
    return MovieDetail(
        id = id,
        imageUrl = "https://image.tmdb.org/t/p/original" + backdropPath,
        title = originalTitle,
        rating = "Rating: ${voteAverage?.round()}"
    )
}

fun ReviewsResponse.Review.toReview(): Review {
    return Review(
        id = id,
        review = content.orEmpty(),
        author = "Author: $author"
    )
}

fun VideosResponse.Video.toVideo(): Video {
    return Video(url = getVideoUrl())
}