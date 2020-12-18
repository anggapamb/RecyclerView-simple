package com.anggapambudi.recyclerviewkoltin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.sdk27.coroutines.onClick

class ListAdapterDetail (private val data: ArrayList<RumahAdat>) : RecyclerView.Adapter<ViewHolderDetail>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderDetail {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderDetail(inflater, parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolderDetail, position: Int) {
        holder.bindtwo(data[position + 1])
    }


}