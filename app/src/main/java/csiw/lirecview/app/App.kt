package csiw.lirecview.app

import android.app.Application

import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.soloader.SoLoader

/**
 * Created by Patel Milan on 19/12/17.
 * Email :- patelmilan2692@gmail.com
 */

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
        SoLoader.init(this, false)
    }
}
