package com.dicoding.picodiploma.gamelist

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_detail_game)
        val actionB = supportActionBar
        actionB!!.title = "Detail"
        actionB.setDisplayHomeAsUpEnabled(true)

        val tvTitle: TextView = findViewById(R.id.tv_set_title)
        val setPicture: ImageView = findViewById(R.id.tv_set_picture)
        val tvGenre : TextView = findViewById(R.id.tv_set_genre)
        val tvRelease : TextView = findViewById(R.id.tv_set_release)
        val tvAge : TextView = findViewById(R.id.tv_set_age)
        val tvDescription : TextView = findViewById(R.id.tv_set_description)

        val intent = intent
        val tTitle  = intent.getStringExtra(E_Title)
        val tPicture  = intent.getIntExtra(E_Picture,0)
        val tGenre  = intent.getStringExtra(E_Genre)
        val tRelease = intent.getStringExtra(E_Release)
        val tAge = intent.getStringExtra(E_Age)
        val tDesc = intent.getStringExtra(E_Description)



        tvTitle.text = tTitle
        Glide.with(this)
                .load(tPicture)
                .apply(RequestOptions())
                .into(setPicture)
        tvGenre.text = tGenre
        tvRelease.text = tRelease
        tvAge.text = tAge
        tvDescription.text = tDesc

        }
    companion object {
        const val E_Title = "e_title"
        const val E_Picture = "e_picture"
        const val E_Genre = "e_identity"
        const val E_Release = "e_overview"
        const val E_Age = "e_age"
        const val E_Description = "e_desc"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}