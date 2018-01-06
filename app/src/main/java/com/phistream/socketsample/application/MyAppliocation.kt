package com.phistream.socketsample.application

import android.app.Application
import android.arch.persistence.room.Room
import com.phistream.socketsample.database.ApplicationDB

/**
 * Created by Manish verma on 1/6/2018.
 * Allright reserved by MMF.
 */
class MyApplication : Application() {
    companion object {
       // var employeeDB: ApplicationDB? = null
    }

    override fun onCreate() {
        super.onCreate()
    }
}