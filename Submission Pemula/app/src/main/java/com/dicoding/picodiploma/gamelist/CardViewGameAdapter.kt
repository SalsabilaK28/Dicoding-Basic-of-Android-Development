package com.dicoding.picodiploma.gamelist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewGameAdapter(private val listGame: ArrayList<Game>) : RecyclerView.Adapter<CardViewGameAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_game, parent, false)
        return CardViewViewHolder(view)
    }
    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = game.name
        holder.tvDetail.text = game.detail
        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listGame[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listGame[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Selected " + listGame[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {


        }
            val moveDetail = Intent(mContext, DetailGame::class.java)
            moveDetail.putExtra(DetailGame.E_Title, game.title)
            moveDetail.putExtra(DetailGame.E_Picture, game.picture)
            moveDetail.putExtra(DetailGame.E_Genre, game.genre)
            moveDetail.putExtra(DetailGame.E_Release, game.release)
            moveDetail.putExtra(DetailGame.E_Age, game.age)
            moveDetail.putExtra(DetailGame.E_Description, game.desc)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listGame.size
    }
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)

    }

}