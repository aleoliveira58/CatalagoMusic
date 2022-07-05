package com.example.catalagodemusicas.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.catalagodemusicas.R
import com.example.catalagodemusicas.databinding.FragmentAlbunsBinding
import com.example.meuapp.ExercicioMusicas.Adapter.AlbunsAdapter


class AlbunsFragment : Fragment() {
    private var binding: FragmentAlbunsBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAlbunsBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val albuns1 = (R.drawable.albumrappa)
        val albuns2 = (R.drawable.album_matue)
        val albuns3 = (R.drawable.album_feliperet)
        val albuns4 = (R.drawable.album_orochi)
        val albuns5 = (R.drawable.album_hariel)

        val nomesArtista1 = "O Rappa"
        val nomesArtista2 = "Matuê"
        val nomesArtista3 = "Filipe Ret"
        val nomesArtista4 = "Orochi"
        val nomesArtista5 = "Mc Hariel"

        val nomesAlbuns1 = "O Rappa Acústico "
        val nomesAlbuns2 = "Maquina do Tempo"
        val nomesAlbuns3 = "Audaz"
        val nomesAlbuns4 = "Celebridade"
        val nomesAlbuns5 = "Avisa que é o Funk"

        val anoLancamento1 = "Ano de Lançamento: 2016"
        val anoLancamento2 = "Ano de Lançamento: 2020"
        val anoLancamento3 = "Ano de Lançamento: 2018"
        val anoLancamento4 = "Ano de Lançamento: 2020"
        val anoLancamento5 = "Ano de Lançamento: 2020"

        val catalagoImagens = listOf(albuns1,albuns2,albuns3,albuns4,albuns5)
        val catalagoNomeArtista = listOf(nomesArtista1,nomesArtista2,nomesArtista3,nomesArtista4,nomesArtista5)
        val catalagoNomeAlbuns = listOf(nomesAlbuns1, nomesAlbuns2,nomesAlbuns3,nomesAlbuns4,nomesAlbuns5)
        val catalgoLancamento = listOf(anoLancamento1,anoLancamento2,anoLancamento3,anoLancamento4,anoLancamento5)


        binding?.vpAlbunsPager2?.adapter = AlbunsAdapter(catalagoImagens,catalagoNomeArtista,catalagoNomeAlbuns,catalgoLancamento)
        binding?.vpAlbunsPager2?.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = binding?.indicatorAlbuns?.setViewPager(binding?.vpAlbunsPager2)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}