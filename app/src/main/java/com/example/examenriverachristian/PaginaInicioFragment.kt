package com.example.examenriverachristian

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.examenriverachristian.databinding.ActivityMainBinding
import com.example.examenriverachristian.databinding.FragmentLoginBinding
import com.example.examenriverachristian.databinding.FragmentPaginaInicioBinding

class PaginaInicioFragment : Fragment() {

private lateinit var binding: FragmentPaginaInicioBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_pagina_inicio, container, false)

        val args:PaginaInicioFragmentArgs by navArgs()
        Toast.makeText(context,"Nombre de usuario: ${args.usuario}", Toast.LENGTH_LONG).show()
        Toast.makeText(context,"Contraseña: ${args.contra}", Toast.LENGTH_LONG).show()





        return binding.root
    }
    


}