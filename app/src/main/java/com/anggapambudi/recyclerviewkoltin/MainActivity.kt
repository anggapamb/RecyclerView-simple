package com.anggapambudi.recyclerviewkoltin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //fulscreen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


        //video splash screen
        tv_video.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.splashscreen))
        tv_video.setMediaController(android.widget.MediaController(this))
        tv_video.start()


        handler = Handler()
        handler.postDelayed({

            val intent = Intent(this@MainActivity, HomeApp::class.java)
            startActivity(intent)
            finish()

        }, 5000)

    }
}