package com.dicoding.picodiploma.gamelist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridGameAdapter(val listGame: ArrayList<Game>) :
    RecyclerView.Adapter<GridGameAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_game, viewGroup, false)
        return GridViewHolder(view)
    }
    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val game = listGame[position]
        Glide.with(holder.itemView.context)
            .load(listGame[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)


        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listGame[holder.adapterPosition])

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
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Game)
    }
}