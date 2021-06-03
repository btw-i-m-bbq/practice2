package com.mirea.veremeev.l.m.intentfilter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val browserButton = findViewById<Button>(R.id.button)
        val shareButton = findViewById<Button>(R.id.button2)

        browserButton.setOnClickListener {
            val address = Uri.parse("https://www.mirea.ru")
            val openLinkIntent = Intent(Intent.ACTION_VIEW, address)

            if (openLinkIntent.resolveActivity(packageManager) != null) {
                startActivity(openLinkIntent)
            } else {
                Log.d("Intent", "Не получается обработать намерение")
            }
        }

        shareButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Веремеев Л.М.")
            startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"))
        }
    }
}