package com.phistream.socketsample.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.phistream.socketsample.model.EmployeeRoom

/**
 * Created by Manish verma on 1/6/2018.
 * Allright reserved by MMF.
 */
@Database(entities = arrayOf(EmployeeRoom::class),version = 1)
abstract class ApplicationDB:RoomDatabase() {
    abstract fun employeeDao():Dao
}