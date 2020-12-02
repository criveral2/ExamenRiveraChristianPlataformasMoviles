package com.example.examenriverachristian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.examenriverachristian.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //codigo para el drawer
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //codigo para el drawer
        drawerLayout = binding.drawerLayout



        //Codigo para la flecha regresar <-
        val navController = this.findNavController(R.id.navegacion_fragment)
        //NavigationUI.setupActionBarWithNavController(this, navController)

        //codigo para el drawer
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
        NavigationUI.setupWithNavController(binding.navView, navController)
    }


    //Codigo para la flecha regresar <-
    override fun onSupportNavigateUp(): Boolean {
        var navController = this.findNavController(R.id.navegacion_fragment)
        //return navController.navigateUp()


        //codigo para el drawer
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}