package com.example.meuapp.ExercicioMusicas.Adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.catalagodemusicas.R
import com.example.meuapp.ExercicioMusicas.Model.ImagensModel





class ImagensAdapter(
    private val imagens: List<Int>,
    private val nomes: List<String>
)
    : RecyclerView.Adapter<ImagensAdapter.ImagensViewHolder>() {


    inner class ImagensViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val itemImage: ImageView = itemView.findViewById(R.id.ivImagensItem)
        val itemNomes: TextView = itemView.findViewById(R.id.txNomesItem)

        init {
            itemImage.setOnClickListener {
                v: View ->
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "${ + position + 1}" , Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagensViewHolder {
        return ImagensViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)
        )
    }


    override fun onBindViewHolder(holder: ImagensViewHolder, position: Int) {
        holder.itemImage.setImageResource(imagens[position])
        holder.itemNomes.text = nomes[position]
    }

    override fun getItemCount(): Int {
        return imagens.size

    }


}

