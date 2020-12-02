package com.example.examenriverachristian

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.examenriverachristian.databinding.FragmentRegistroBinding

class RegistroFragment : Fragment() {

private lateinit var binding: FragmentRegistroBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_registro, container, false)




        binding.btnLogear.setOnClickListener { view: View ->

           view.findNavController().navigate(RegistroFragmentDirections.actionRegistroFragmentToPaginaInicioFragment(binding.txtUserRe.getText().toString(),binding.txtContraseniaRe.getText().toString()))

        }

        return binding.root
    }


}