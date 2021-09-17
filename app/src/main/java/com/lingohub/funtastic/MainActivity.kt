package com.lingohub.funtastic

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.lingohub.LingoHub
import java.util.*

class MainActivity : AppCompatActivity() {

    private val lingohubDelegate: AppCompatDelegate by lazy {
        LingoHub.getAppCompatDelegate(this, super.getDelegate())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //updateLocale(this)
        setContentView(R.layout.activity_main)
    }

    override fun getDelegate() = lingohubDelegate

    fun updateLocale(context: Context) {
        val resources: Resources = context.resources
        val config = resources.configuration
        val locale = Locale.ENGLISH
        LingoHub.setLocale(locale)
        Locale.setDefault(locale)
        config.setLocale(locale)

        ContextWrapper(context).createConfigurationContext(config)
        resources.updateConfiguration(config, resources.displayMetrics)
    }
}