package com.dicoding.picodiploma.gamelist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvGames : RecyclerView
    private var list: ArrayList<Game> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*-----------------*/
        val actionbar = supportActionBar
        actionbar!!.title= "Top 10 Games in Switch"
        /*----------------*/
        rvGames = findViewById(R.id.rv_games)
        rvGames.setHasFixedSize(true)

        list.addAll(GamesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvGames.layoutManager = LinearLayoutManager(this)
        val listGameAdapter = ListGameAdapter(list)
        rvGames.adapter = listGameAdapter

        listGameAdapter.setOnItemClickCallback(object : ListGameAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Game) {
                showSelectedHero(data)
            }
        })

    }

    private fun showRecyclerGrid() {
        rvGames.layoutManager = GridLayoutManager(this, 2)
        val gridGameAdapter = GridGameAdapter(list)
        rvGames.adapter = gridGameAdapter

        gridGameAdapter.setOnItemClickCallback(object : GridGameAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Game) {
                showSelectedHero(data)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvGames.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewGameAdapter(list)
        rvGames.adapter = cardViewHeroAdapter
    }

    private fun showSelectedHero(game: Game) {
        Toast.makeText(this, "Selected " + game.name, Toast.LENGTH_SHORT).show()
    }

   /* -----------------------------------------
    private fun showAbout() {
        rvGames.layoutManager = LinearLayoutManager(this)
        val About = About(list)
        rvGames.adapter = About
    }
    ----------------------------------------*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)/*{
            R.id.action_about -> {
                startActivity(Intent(this@MainActivity, About::class.java))
            }
        }*/
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v : View) {
        when(v.id){
            R.id.action_about -> {
                startActivity(Intent(this@MainActivity, About::class.java))
            }
        }

    }

     private fun setMode(selectedMode: Int) {
         when (selectedMode) {
             R.id.action_list -> {
                 showRecyclerList()
             }

             R.id.action_grid -> {
                 showRecyclerGrid()
             }

             R.id.action_cardview -> {
                 showRecyclerCardView()
                }

             R.id.action_about -> {
                 startActivity(Intent(this@MainActivity, About::class.java))
             }

            }
        }
    }
