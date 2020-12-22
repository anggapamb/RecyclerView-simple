package com.anggapambudi.recyclerviewkoltin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.sdk27.coroutines.onClick

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_list, parent, false)) {

    private var tvName: TextView? = null
    private var tvDetail: TextView? = null
    private var tvPhoto: ImageView? = null

    init {
        tvName = itemView.findViewById(R.id.tv_item_name)
        tvDetail = itemView.findViewById(R.id.tv_item_detail)
        tvPhoto = itemView.findViewById(R.id.tv_item_photo)
    }

    fun bind(data: RumahAdat) {
        tvName?.text = data.name
        tvDetail?.text = data.detail
        tvPhoto?.setImageResource(data.photo)

        //set onClick pada item
        itemView.onClick {
            Intent(itemView.context, DetailInformation::class.java).apply {
                putExtra("photo", data.photo)
                putExtra("name", data.name)
                putExtra("detail", data.detail)

                //toast
                Toast.makeText(itemView.context, data.name, Toast.LENGTH_SHORT).show()

            }.also {
                itemView.context.startActivity(it)
            }
        }

    }

}