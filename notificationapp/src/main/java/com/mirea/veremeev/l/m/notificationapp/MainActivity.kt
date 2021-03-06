package com.mirea.veremeev.l.m.notificationapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    private final val CHANNEL_ID : String = "com.mirea.asd.notification.ANDROID"
    private var IDENTIFICATE_MSG : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun onClickSendNotification(view : View){
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        val resultIntent = Intent(this, MainActivity::class.java)
        val resultPendingIntent = PendingIntent.getActivity(this, 0,
                                                    resultIntent, PendingIntent.FLAG_UPDATE_CURRENT)

        if  (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val notificationChannel = NotificationChannel(CHANNEL_ID, "MyNotifications",
                                                            NotificationManager.IMPORTANCE_DEFAULT)
            notificationChannel.description = "Channel description"
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.RED
            notificationChannel.vibrationPattern = longArrayOf(0, 1000, 500, 1000)
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
        }

        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Title")
            .setContentText("Notification text for MIREA")
            .setWhen(System.currentTimeMillis())
            .setProgress(100,50, false)
            .setContentIntent(resultPendingIntent)
        val notification = builder.build()

        notificationManager.notify(IDENTIFICATE_MSG++, notification)
    }
}