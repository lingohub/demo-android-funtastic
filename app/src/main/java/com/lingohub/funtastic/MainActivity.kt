package com.lingohub.funtastic

import android.content.Context
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lingohub.LingoHub

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LingoHub.wrap(newBase))
    }

    override fun getResources(): Resources {
        return LingoHub.wrap(baseContext).resources
    }
}