package com.example.catalagodemusicas.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.catalagodemusicas.R
import com.example.catalagodemusicas.Utils.OnClickListenerMusica
import com.example.catalagodemusicas.databinding.FragmentMusicasBinding
import com.example.meuapp.ExercicioMusicas.Adapter.MusicaAdapter
import com.example.meuapp.ExercicioMusicas.Model.ModelMusicas


class MusicasFragment : Fragment(), OnClickListenerMusica {
    private var binding: FragmentMusicasBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMusicasBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val musica1 = ModelMusicas(
            nome = "Pescador de Ilusões",
            artista = "6:10"
        )
        val musica2 = ModelMusicas(
            nome = "Anjos (Pra Quem Tem Fé) [Ao Vivo]",
            artista = "7:19"
        )
        val musica3 = ModelMusicas(
            nome = "Vários Holofotes (Ao Vivo)",
            artista = "4:39"
        )
        val musica4 = ModelMusicas(
            nome = "Cruz de Tecido (Ao Vivo)",
            artista = "4:22"
        )
        val musica5 = ModelMusicas(
            nome = "Hóstia (Ao Vivo)",
            artista = "3:23"
        )
        val musica6 = ModelMusicas(
            nome = "Bitterusso Champagne (Ao Vivo)",
            artista = "3:26"
        )
        val musica7 = ModelMusicas(
            nome = "Sentimento (Ao Vivo)",
            artista = "4:13"
        )
        val musica8 = ModelMusicas(
            nome = "Não Vão Me Matar (Ao Vivo)",
            artista = "3:47"
        )
        val musica9 = ModelMusicas(
            nome = "Intervalo Entre Carros (Ao Vivo)",
            artista = "5:45"
        )
        val musica10 = ModelMusicas(
            nome = "Vezes (Ao Vivo)",
            artista = "4:31"
        )
        val musica11 = ModelMusicas(
            nome = "Reza Vela / Norte-Nordeste Veste (Ao Vivo) [Participação Especial de RAPadura Xique Chico]",
            artista = "6:18"
        )
        val musica12 = ModelMusicas(
            nome = "Uma Vida Só (Ao Vivo)",
            artista = "3:56"
        )
        val musica13 = ModelMusicas(
            nome = "Na Horda (Ao Vivo)",
            artista = "5:07"
        )
        val musica14 = ModelMusicas(
            nome = "Linha Vermelha (Ao Vivo)",
            artista = "2:57"
        )

        val catalogoMusica = listOf(musica1, musica2, musica3, musica4, musica5, musica6,
            musica7, musica8, musica9, musica10, musica11, musica12, musica13, musica14)


        val musicaAdapter = MusicaAdapter(
            musicaList = catalogoMusica,
            onClickListener = {
                Toast.makeText(context, " ${it.nome}  - ${it.artista}", Toast.LENGTH_SHORT).show()
            },
            this
        )

        binding?.let {
            with(it) {
                vgMusicasRecyclerView.layoutManager = LinearLayoutManager(context)
                vgMusicasRecyclerView.adapter = musicaAdapter

            }
        }
    }

    //Tem 2 modelos de mostrar o layouts = LinearLayoutManagr e GrideLayoutManager


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onClickListener(musica: ModelMusicas) {
        Toast.makeText(context, " ${musica.nome}  - ${musica.artista}", Toast.LENGTH_SHORT).show()
    }

}