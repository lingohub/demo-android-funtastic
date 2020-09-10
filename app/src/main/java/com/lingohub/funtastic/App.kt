package com.lingohub.funtastic

import android.app.Application
import com.lingohub.LingoHub

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        LingoHub.configure(this, "{insert_api_key}", "{insert_project_id}")
        LingoHub.fetchStrings()
    }
}