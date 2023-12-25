package com.pavel.appupdate

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.pavel.update.AppUpdater
import com.pavel.update.interfaces.UpdateListeners


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appUpdater = AppUpdater(this)
        appUpdater.start(object : UpdateListeners{
            override fun onUpdate(value: Boolean) {
                Log.d("SHOW_UPDATE", "App Update value is ${value}")
            }

        })
    }
}