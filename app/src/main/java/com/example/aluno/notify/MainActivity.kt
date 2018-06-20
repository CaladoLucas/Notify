package com.example.aluno.notify

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val intent = Intent(this,FonActivity::class.java)
            val pIntent = PendingIntent.getActivity(this,1,intent,0)


            val not = NotificationCompat.Builder(this,"id")
                    .setSmallIcon(R.drawable.ic_launcher_background )
                    .setContentTitle("Olha eu aqui")
                    .setContentText("Abre a porra da tela")
                    .setContentIntent(pIntent)
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setStyle(NotificationCompat.BigTextStyle()
                            .setBigContentTitle("titututaiuuiasiudf")
                            .bigText("Olha o big aesdlkfboalkndsfibogdsbgdsinooindgsoindsgoindsginodfshinodfhsi"))
                    .setAutoCancel(true)

            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            notificationManager.notify(1, not.build())
        }
    }


}
