package com.haikal.photos.presentation.user

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.haikal.photos.R
import com.haikal.photos.databinding.ItemUserBinding
import com.haikal.photos.datasource.local.model.User

class UserAdapter(private val onItemClick: ( User) -> Unit,
                  private val onUpdate: (User) -> Unit,
                  private val onDelete: (User) -> Unit) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    private val itemList = mutableListOf<User>()

    fun addItems(itemList: List<User>) {
        this.itemList.clear()
        this.itemList.addAll(itemList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemUserBinding =
            ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemUserBinding)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = itemList[position]
        holder.bind(data)
        holder.itemView.setOnClickListener { onItemClick(data) }
    }

    inner class ViewHolder(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: User) {
            with(binding) {
                textId.text = data.id.toString()
                textUsername.text = data.username
                textEmail.text = data.email
                textRole.text = data.role

                btnUpdate.setOnClickListener { onUpdate(data) }
                btnDelete.setOnClickListener { onDelete(data) }
            }
        }
    }
}

