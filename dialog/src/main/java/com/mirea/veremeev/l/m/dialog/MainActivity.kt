package com.mirea.veremeev.l.m.dialog

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun onClickShowDialog(view : View){
        val dialogFragment = MyDialogFragment()
        dialogFragment.show(supportFragmentManager, "mirea")
    }

    public fun onClickShowClock(view: View){
        val dialogFragment = MyTimeDialogFragment()
        dialogFragment.show(supportFragmentManager, "mirea")
    }

    public fun onClickShowCalendar(view : View){
        val dialogFragment = MyDateDialogFragment()
        dialogFragment.show(supportFragmentManager, "mirea")
    }

    public fun onDateSetAction(year: Int, month: Int, dayOfMonth: Int){
        Log.w(ContentValues.TAG, "onTimeSetAction")
        Toast.makeText(applicationContext, String.format("Выбранная вами дата: %d.%d.%d", dayOfMonth, month, year),
            Toast.LENGTH_LONG).show()
    }

    public fun onTimeSetAction(hour : Int, minute : Int){
        Log.w(ContentValues.TAG, "onTimeSetAction")
        Toast.makeText(applicationContext, String.format("Выбранное вами время: %d:%d", hour, minute),
            Toast.LENGTH_LONG).show()
    }

    public fun onOkClicked(){
        Toast.makeText(applicationContext,"Вы выбрали кнопку \"Иду дальше\"!",
            Toast.LENGTH_SHORT).show()
    }

    public fun onCancelClicked(){
        Toast.makeText(applicationContext,"Вы выбрали кнопку \"Нет\"!",
            Toast.LENGTH_SHORT).show()
    }
    public fun onNeutralClicked(){
        Toast.makeText(applicationContext,"Вы выбрали кнопку \"На паузе\"!",
            Toast.LENGTH_SHORT).show()
    }
}