package com.example.meuapp.ExercicioMusicas.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catalagodemusicas.Utils.OnClickListenerMusica
import com.example.catalagodemusicas.databinding.MusicaLayout2Binding
import com.example.catalagodemusicas.databinding.MusicaLayoutBinding
import com.example.meuapp.ExercicioMusicas.Model.ModelMusicas




class MusicaAdapter(
    private val musicaList: List<ModelMusicas>,
    //Função lambida(anonima)
    private val onClickListener: (musica : ModelMusicas) -> Unit,
    private val onClickListenerMusica: OnClickListenerMusica

    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    class ViewHolder(
        val binding: MusicaLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(
            musica: ModelMusicas,
            onClickListenerMusica: OnClickListenerMusica,

            ) {
            binding.txNomeMusica.text = musica.nome
            binding.txNomeArtista.text = musica.artista
            binding.vgMusicItemContainer.setOnClickListener {
                onClickListenerMusica.onClickListener(musica)
            }
        }
    }

    class ViewHolderBlack(
        val binding: MusicaLayout2Binding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(
            musica: ModelMusicas,
            onClickListener: (musica: ModelMusicas) -> Unit,
        ) {
            binding.txNomeMusica.text = musica.nome
            binding.txNomeArtista.text = musica.artista
            binding.vgMusicItemContainer.setOnClickListener {
                onClickListener(musica)
            }
        }
    }


    //OnCreateViewHolder = pega o xml(item) e coloca para dentro do binding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if(viewType == VIEW_TYPE_DEFAUT){
            val binding = MusicaLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false)
            ViewHolder(binding)
        } else {
            val binding = MusicaLayout2Binding.inflate(
                LayoutInflater.from(parent.context), parent, false)
            ViewHolderBlack(binding)
        }

    }

    //OnBindViewHolder colocar os dados que criamos na classe ViewHolder para a tela
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder) {
            holder.bind(musicaList[position], onClickListenerMusica)
        }else if (holder is ViewHolderBlack){
            holder.bind(musicaList[position], onClickListener)
        }
    }

    // getItemCount = fala para lista quanto itens vai ter
    override fun getItemCount() = musicaList.size

    override fun getItemViewType(position: Int): Int {
        return if (position % 2 == 0){
             VIEW_TYPE_BLACK
        } else{
             VIEW_TYPE_DEFAUT
        }
    }

    companion object{
        const val VIEW_TYPE_DEFAUT = 1
        const val VIEW_TYPE_BLACK = 2

    }


}








