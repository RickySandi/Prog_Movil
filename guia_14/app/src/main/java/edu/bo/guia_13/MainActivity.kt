package edu.bo.guia_13

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        session.user = Usuario("Ricardo","Sandi",23)
    }
    fun openSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}