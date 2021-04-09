package com.dicoding.picodiploma.gamelist

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_about)
        val actionB = supportActionBar
        actionB!!.title = "About"
        actionB.setDisplayHomeAsUpEnabled(true)

        val myImg: ImageView = findViewById(R.id.img_photo)

        val iImg = R.drawable.photo_about

        Glide.with(this)
            .load(iImg)
            .apply(RequestOptions())
            .into(myImg)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}