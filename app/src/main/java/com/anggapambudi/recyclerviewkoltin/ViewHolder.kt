package com.anggapambudi.recyclerviewkoltin

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

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
    }

}