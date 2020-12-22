package com.anggapambudi.recyclerviewkoltin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_information.*

class DetailInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_information)

        //ambil data
        val photo = intent.getIntExtra("photo", R.drawable.joglo)
        val name = intent.getStringExtra("name")
        val detail = intent.getStringExtra("detail")

        //set data
        tvDetailPhoto.setImageResource(photo)
        tvDetailName.setText(name)
        tvDetailDetail.setText(detail)

    }
}