package edu.bo.guia_21

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    private val buttonAlert : Button
        get() = findViewById(R.id.setNeutralButton)

//    private val button6Alert : Button
//        get() = findViewById(R.id.setNeutralButton)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAlert.setOnClickListener {
            val builder = AlertDialog.Builder(it.context)
            builder.setTitle("Android Alert")
            builder.setMessage("We have a message")
            builder.show()

            builder.setPositiveButton("Ok") { _,_ ->
                Toast.makeText(it.context, "Okey", Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No okey") {
                    dialog, i ->
                Toast.makeText(it.context, "No Okey", Toast.LENGTH_LONG).show()
            }

            builder.setNeutralButton("Maybe", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(it.context, "Maybe", Toast.LENGTH_LONG).show()
            })
            builder.show()
        }

        /*button6Alert.setOnClickListener {
            val builder = AlertDialog.Builder(it.context)
            val inflater = layoutInflater
            builder.setTitle("With EditText")
            val dialogLayout = inflater.inflate(R.layout.alert_dialog_with_edittext, null)
            val editText  = dialogLayout.findViewById<EditText>(R.id.editText)
            builder.setView(dialogLayout)
            builder.setPositiveButton("OK") { dialogInterface, i -> Toast.makeText(it.context, "EditText is " + editText.text.toString(), Toast.LENGTH_SHORT).show() }
            builder.show()
        }*/

    }
}