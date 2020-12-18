package com.anggapambudi.recyclerviewkoltin

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderDetail(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.activity_detail_information, parent, false)) {

        private var tvDetailNama: TextView? = null
        private var tvDetailDetail: TextView? = null
        private var tvDetailPhoto: ImageView? = null

        init {
            tvDetailPhoto = itemView.findViewById(R.id.tvDetailPhoto)
            tvDetailNama = itemView.findViewById(R.id.tvDetailNama)
            tvDetailDetail = itemView.findViewById(R.id.tvDetailDetail)
        }

        fun bindtwo(data: RumahAdat) {
                tvDetailPhoto?.setImageResource(data.photo)
                tvDetailNama?.text = data.name
                tvDetailDetail?.text = data.detail
        }

}