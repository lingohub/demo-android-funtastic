package com.lingohub.funtastic

import android.app.Application
import android.util.Log
import com.lingohub.LingoHub
import com.lingohub.LingoHubLogger

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        LingoHub.setLogger(object : LingoHubLogger {
            override fun onInfo(message: String) {
                Log.d("LH SDK", message)
            }

            override fun onError(error: String, cause : Throwable?) {
                Log.e("LH SDK", error, cause)
            }

        })
        LingoHub.configure(this, "api_98f77059-d105-4fd1-ac1a-9071b98fbb50", "pr_488c1a64-08ad-470e-859b-9983caeda6b8") // Funtastic

        //LingoHub.setPreproductionEnabled()
        LingoHub.fetchStrings()
    }
}