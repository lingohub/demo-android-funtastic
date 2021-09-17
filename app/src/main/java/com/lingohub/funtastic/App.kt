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
        LingoHub.configure(this, "api_6e6bf7ad-21c9-49c4-80b3-f80b46a79f9f", "pr_488c1a64-08ad-470e-859b-9983caeda6b8") // Funtastic

        //LingoHub.setPreproductionEnabled()
        LingoHub.fetchStrings()
    }
}