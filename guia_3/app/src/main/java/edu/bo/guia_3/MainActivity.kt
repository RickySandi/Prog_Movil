package edu.bo.guia_3

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private val redBtn : Button
        get() = findViewById(R.id.red_btn)

    private val whiteBtn : Button
        get() = findViewById(R.id.white_btn)

    private val layoutPrincipal : ConstraintLayout
        get() = findViewById(R.id.layout_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redBtn.setOnClickListener{
//            toast(getString(R.string.btn_red_label))

            layoutPrincipal.setBackgroundColor(Color.RED)
            toast("ROJO")
        }

        whiteBtn.setOnClickListener{
//            toast(getString(R.string.btn_white_label))

            layoutPrincipal.setBackgroundColor(Color.WHITE)
            toast("BLANCO")
        }
    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG)=
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
}