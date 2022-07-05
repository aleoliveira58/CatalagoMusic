package com.example.meuapp.ExercicioMusicas.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.catalagodemusicas.R
import com.example.meuapp.ExercicioMusicas.Model.AlbunsModel


class AlbunsAdapter(
    private val imagens: List<Int>,
    private val nomeArtista: List<String>,
    private val nomeAlbuns: List<String>,
    private val anoLancamento: List<String>
) : RecyclerView.Adapter<AlbunsAdapter.AlbunsViewHolder>(){


    inner class AlbunsViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val itemAlbuns: ImageView = itemView.findViewById(R.id.ivAlbunsItem)
        val itemNomesArtista: TextView = itemView.findViewById(R.id.txAlbunsArtistaItem)
        val albuns: TextView = itemView.findViewById(R.id.txNomesAlbunsItem)
        val itemLancamento: TextView = itemView.findViewById(R.id.txAlbunsAnoLancamentoItem)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbunsViewHolder {
        return AlbunsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.albuns_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AlbunsViewHolder, position: Int) {
        holder.itemAlbuns.setImageResource(imagens[position])
        holder.itemNomesArtista.text = nomeArtista[position]
        holder.albuns.text = nomeAlbuns[position]
        holder.itemLancamento.text = anoLancamento[position]
    }

    override fun getItemCount(): Int {
        return imagens.size
    }


}