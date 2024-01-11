package com.example.mod5d01

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val mail: String,
    val password: String
) : Parcelable {

}
