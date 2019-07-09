package com.example.pidsrequestlibrary

import com.squareup.moshi.Json

data class PidResponse(
    @field:Json(name = "age")
    val age: Int,
    @field:Json(name = "avatar")
    val avatar: String,
    @field:Json(name = "firstname")
    val firstName: String,
    @field:Json(name = "gender")
    val gender: String,
    @field:Json(name = "id")
    val id: Int,
    @field:Json(name = "secondname")
    val secondName: String
)