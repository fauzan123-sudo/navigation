package com.example.anyar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.anyar.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Setting Bottom Navigation
        val navController = findNavController(R.id.fragmentContainer)
        bottomNav.setupWithNavController(navController)

//        Setting TopBar
        val topBar = AppBarConfiguration(setOf(R.id.home_fragment, R.id.list_data, R.id.setting2))
        setupActionBarWithNavController(navController, topBar)
    }
}