package com.phistream.socketsample.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by Manish verma on 1/3/2018.
 * Allright reserved by MMF.
 */
@Entity(tableName = "Employee")
data class EmployeeRoom (@PrimaryKey(autoGenerate = true)
                         @ColumnInfo(name = "user_id") val id :Long=0,
                         @ColumnInfo(name = "employee_name") var username:String,
                         @ColumnInfo(name = "employee_email") var emailId:String)