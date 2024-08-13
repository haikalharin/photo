package com.haikal.photos.presentation.photos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.haikal.photos.databinding.ItemPhotoBinding
import com.paem.core.entities.Photo

class PhotoListPagingAdapter(private val onItemClick: (item: Photo) -> Unit) :
    PagingDataAdapter<Photo, PhotoListPagingAdapter.ViewHolder>(MovieComparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPhotoBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = getItem(position)!!
        holder.binding.root.setOnClickListener { onItemClick(movie) }
        holder.bind(movie)
    }

    class ViewHolder(val binding: ItemPhotoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Photo) {
            with(binding) {
                Glide.with(binding.root)
                    .load(data.thumbnailUrl)
                    .into(imgPoster)
                tvTitle.text = data.title
            }
        }
    }

    object MovieComparator : DiffUtil.ItemCallback<Photo>() {
        override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean {
            return oldItem == newItem
        }
    }
}