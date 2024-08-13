package com.haikal.photos.presentation.photos;

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.recyclerview.widget.GridLayoutManager
import com.haikal.photos.R
import com.haikal.photos.databinding.ActivityPhotosBinding
import com.haikal.photos.presentation.login.LoginActivity
import com.paem.core.entities.Photo
import com.paem.core.utils.gone
import com.paem.core.utils.show
import com.paem.core.utils.showToast
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class PhotosActivity : AppCompatActivity() {

    private val vm: PhotosViewModel by viewModel()

    private val moviesAdapter = PhotoListPagingAdapter {
//        NavigationUtils.navigateToMovieDetails(this, it.id)
    }

    private val binding by lazy { ActivityPhotosBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?): Unit = with(binding) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolBar)
        lifecycleScope.launch {
            vm.getPhotoPagination().observe(this@PhotosActivity) {
                showPhotos(it)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_logout -> {
                // Handle logout action here
                logoutUser()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun logoutUser() {
        // Clear user session, redirect to login, etc.
        Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show()

        val sharedPreferences = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
        val intent = Intent(this, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }

    private fun showPhotos(photoList: PagingData<Photo>) {
        with(binding) {
            moviesAdapter.submitData(lifecycle, photoList)
            rvMovies.apply {
                layoutManager = GridLayoutManager(this@PhotosActivity, 2)
                adapter = moviesAdapter
            }
        }
        setupLoadingState()
    }

    private fun setupLoadingState() {
        with(binding) {
            moviesAdapter.addLoadStateListener { loadState ->
                // show empty list
                if (loadState.refresh is LoadState.Loading ||
                    loadState.append is LoadState.Loading)
                    progressBar.show()
                else {
                    progressBar.gone()
                    // If we have an error, show a toast
                    val errorState = when {
                        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
                        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
                        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
                        else -> null
                    }
                    errorState?.let {
                        showToast(it.error.toString())
                    }

                }
            }
        }
    }

    companion object {
        const val KEY_GENRE_ID = "KEY_GENRE_ID"
    }
}