package com.phistream.socketsample.model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator

/**
 * Created by Manish verma on 1/2/2018.
 * Allright reserved by MMF.
 */
class EmployeeModel : Parcelable {
    var name: String? = null
    var email: String? = null

    companion object {
        @JvmStatic
        val CREATOR: Creator<EmployeeModel> = object : Creator<EmployeeModel> {
            override fun createFromParcel(source: Parcel) = EmployeeModel(source)

            override fun newArray(size: Int) = arrayOfNulls<EmployeeModel>(size)

        }
    }

    private constructor(source: Parcel?) {
        this.name = source?.readString()
        this.email = source?.readString()
    }


    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeString(email)
    }

    override fun describeContents() = 0
}