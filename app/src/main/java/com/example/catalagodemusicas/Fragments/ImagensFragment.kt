package com.example.catalagodemusicas.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.catalagodemusicas.R
import com.example.catalagodemusicas.databinding.FragmentImagensBinding
import com.example.meuapp.ExercicioMusicas.Adapter.ImagensAdapter


class ImagensFragment : Fragment() {
    private var binding: FragmentImagensBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentImagensBinding.inflate(inflater, container, false)
        return binding?.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val imagem1 = (R.drawable.falcao)
        val nome1 = "Falção"


        val imagem2 = (R.drawable.matue)
        val nome2 = "Matuê"


        val imagem3 = (R.drawable.ret)
        val nome3 = "Felipe Ret"


        val imagem4 = (R.drawable.orochi)
        val nome4 = "Orochi"

        val imagem5 = (R.drawable.hariel)
        val nome5 = "Mc Hariel"

        val catalagoImagem = listOf(imagem1,imagem2,imagem3,imagem4,imagem5,)
        val listNomes = listOf(nome1,nome2,nome3,nome4,nome5)

        binding?.vpImagensPager2?.adapter = ImagensAdapter(catalagoImagem,listNomes)
        binding?.vpImagensPager2?.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = binding?.indicator?.setViewPager(binding?.vpImagensPager2)


        binding?.btProximaImagem?.setOnClickListener {

            binding?.vpImagensPager2?.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
        }


    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}