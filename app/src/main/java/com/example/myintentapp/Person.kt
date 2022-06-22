package com.example.myintentapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(val id: Int?, val name: String?): Parcelable