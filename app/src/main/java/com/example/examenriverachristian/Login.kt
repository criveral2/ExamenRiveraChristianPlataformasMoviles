package com.example.examenriverachristian

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.examenriverachristian.databinding.FragmentLoginBinding


class Login : Fragment() {
    private lateinit var binding: FragmentLoginBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)

        var usuario: String = "admin";
        var contrasenia: String = "admin";


        binding.btnIngresar.setOnClickListener { view: View ->

            if(usuario == binding.txtUser.getText().toString() && contrasenia == binding.txtContrasenia.getText().toString()){
                view.findNavController().navigate(LoginDirections.actionLoginToPaginaInicioFragment(usuario!!,contrasenia!!))
            }else{

            }


        }

        binding.btnCrear.setOnClickListener { view: View ->
            view.findNavController().navigate(LoginDirections.actionLoginToRegistroFragment())

        }



        //Codigo para el menu item normal
        setHasOptionsMenu(true)


        return binding.root
    }

    //Codigo para el menu item normal
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.inicio_menu, menu)
    }
    //Codigo para el menu item normal
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, requireView().findNavController()) || super.onOptionsItemSelected(item)


    }
}