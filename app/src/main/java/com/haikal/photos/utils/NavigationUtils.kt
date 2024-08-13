package com.android.catalogmovie.utils

import android.app.Activity
import android.content.Intent
import com.haikal.photos.presentation.photos.PhotosActivity

object NavigationUtils {

    fun navigateToMovies(activity: Activity, genreId: Int?) {
        val intent = Intent(activity, PhotosActivity::class.java)
        intent.putExtra(PhotosActivity.KEY_GENRE_ID, genreId)
        activity.startActivity(intent)
    }

}