package edu.bo.guia_17_swipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout import java.util.*

class MainActivity : AppCompatActivity() {
    companion object {
    val TAG : String = MainActivity::class.java.simpleName
    }
    lateinit var swipeToRefresLayout : SwipeRefreshLayout
    lateinit var message_text_view : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        swipeToRefresLayout = findViewById(R.id.swipeToRefresLayout)
        message_text_view = findViewById(R.id.message_text_view)
        swipeToRefresLayout.setOnRefreshListener {
            message_text_view.text = Random().nextInt(100).toString()
            swipeToRefresLayout.isRefreshing = false
            Log.d(TAG, message_text_view.text.toString())
        }
    }
}