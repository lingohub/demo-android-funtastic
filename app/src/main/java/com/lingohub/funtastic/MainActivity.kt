package com.lingohub.funtastic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.lingohub.LingoHub

class MainActivity : AppCompatActivity() {

    private val lingohubDelegate: AppCompatDelegate by lazy {
        LingoHub.getAppCompatDelegate(this, super.getDelegate())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getDelegate() = lingohubDelegate
}