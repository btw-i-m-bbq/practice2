package com.mirea.veremeev.l.m.toastapp

import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mirea.veremeev.l.m.toast_app.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(applicationContext,
            "Здравствуй, МИРЭА, Веремеев Л.М.",
            Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.BOTTOM, 0, 0)
        val toastContainer : LinearLayout = toast.view as  LinearLayout
        val catImageView = ImageView(applicationContext)
        catImageView.setImageResource(R.drawable.ic_launcher_background)
        toastContainer.addView(catImageView, 0)
        toast.show()
    }
}