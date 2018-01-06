package com.phistream.socketsample

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.phistream.socketsample.model.EmployeeRoom

/**
 * Created by Manish verma on 1/4/2018.
 * Allright reserved by MMF.
 */
@Dao
public interface Dao {
    @get:Query("SELECT * FROM employeeRoom")
    var getEmployees: List<EmployeeRoom>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insetUser(employeeRoom: EmployeeRoom)
}