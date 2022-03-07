package edu.bo.ucb

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

    private val servicesBtn : Button
        get() = findViewById(R.id.btn_servicios)
    private val portfolioBtn: Button
        get() = findViewById(R.id.btn_portafolio)
    private val aboutBtn : Button
        get() = findViewById(R.id.btn_acercade)
    private val contactBtn: Button
        get() = findViewById(R.id.btn_contacto)
    private val socialMediaBtn: Button
        get() = findViewById(R.id.btn_redessociales)

    private val layoutPrincipal: ConstraintLayout
        get() = findViewById(R.id.layout_main)

    private val textViewSelectedBtn: TextView
        get() = findViewById(R.id.textView_selectedBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          servicesBtn.setOnClickListener{
//            toast(getString(R.string.btn_red_label))
            textViewSelectedBtn.setText("Servicios")
        }
        portfolioBtn.setOnClickListener{
//            toast(getString(R.string.btn_red_label))
            textViewSelectedBtn.setText("Portafolio")
        }
        aboutBtn.setOnClickListener{
//            toast(getString(R.string.btn_red_label))
            textViewSelectedBtn.setText("Acerca de")
        }
        contactBtn.setOnClickListener{
//            toast(getString(R.string.btn_red_label))
            textViewSelectedBtn.setText("Contacto")
        }
        socialMediaBtn.setOnClickListener{
//            toast(getString(R.string.btn_red_label))
            textViewSelectedBtn.setText("Redes Sociales")
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }

    }

   private fun toast(text: String, duration: Int =
        Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
}
