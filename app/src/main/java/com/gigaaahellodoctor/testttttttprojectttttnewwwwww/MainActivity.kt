package com.gigaaahellodoctor.testttttttprojectttttnewwwwww

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.appfiza.myreactlib.GigaaaMsdkActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this@MainActivity, GigaaaMsdkActivity::class.java)
        intent.putExtra("userId", "30823")
        findViewById<android.view.View>(R.id.button_click).setOnClickListener { v: android.view.View? ->
            startActivity(
                intent
            )
        }
    }
}