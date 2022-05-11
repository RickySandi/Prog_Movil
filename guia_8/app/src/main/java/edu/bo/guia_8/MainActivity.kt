package edu.bo.guia_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private val layoutPrincipal : ConstraintLayout
        get() = findViewById(R.id.main_layout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        Snackbar.make(layoutPrincipal, getString(R.string.mensaje_snackbar), Snackbar.LENGTH_LONG).show()
    }
}
