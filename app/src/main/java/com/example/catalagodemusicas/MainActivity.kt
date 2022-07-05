package com.example.catalagodemusicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.catalagodemusicas.Fragments.AlbunsFragment
import com.example.catalagodemusicas.Fragments.ImagensFragment
import com.example.catalagodemusicas.Fragments.MusicasFragment
import com.example.catalagodemusicas.databinding.ActivityMainBinding
import com.example.meuapp.ExercicioMusicas.Adapter.ViewPageAdapterMusicas

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragments = listOf(MusicasFragment(), ImagensFragment(), AlbunsFragment())
        val fragmentsPageTitle = listOf("Músicas", "Imagens", "Álbuns")
        val viewPageAdapterMusicas = ViewPageAdapterMusicas(
            fragmentManager = supportFragmentManager,
            fragmentsList = fragments,
            fragmentsTitleList = fragmentsPageTitle
        )





        with(binding) {
            vpExercicioMusicas.adapter = viewPageAdapterMusicas
            tlExercicioMusicas.setupWithViewPager(vpExercicioMusicas)

        }

    }
}