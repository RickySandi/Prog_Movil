package edu.bo.guia_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.navigation.NavigationBarView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val principal_bottom_navigation_view: NavigationBarView
        get() = findViewById(R.id.principal_bottom_navigation_view)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        principal_bottom_navigation_view.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_bottom_navigation_menu -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.principal_frame_layout, HomeFragment())
                        .commit()
                    true
                }
                R.id.profile_bottom_navigation_menu -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.principal_frame_layout, ProfileFragment())
                        .commit()
                    true
                }
                else -> true
            }
        }
    }
}