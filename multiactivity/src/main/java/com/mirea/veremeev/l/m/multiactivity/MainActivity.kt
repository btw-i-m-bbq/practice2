package com.mirea.veremeev.l.m.multiactivity

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(ContentValues.TAG, "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(ContentValues.TAG, "onStart()")
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle){
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(ContentValues.TAG, "onRestoreInstanceState()")
    }
    override fun onRestart(){
        super.onRestart()
        Log.i(ContentValues.TAG, "onRestart()")

    }
    override fun onResume(){
        super.onResume()
        Log.i(ContentValues.TAG, "onResume()")
    }
    override fun onPause(){
        super.onPause()
        Log.i(ContentValues.TAG, "onPause()")

    }
    override fun onSaveInstanceState(outState: Bundle){
        super.onSaveInstanceState(outState)
        Log.i(ContentValues.TAG, "onSaveInstanceState()")
    }
    override fun onStop(){
        super.onStop()
        Log.i(ContentValues.TAG, "onStop()")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.i(ContentValues.TAG, "onDestroy()")
    }

    public fun onClickNewActivity(view: View){
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("key", "МИРЭА - Веремеев Л.М.")
        }
        startActivity(intent)
    }
}