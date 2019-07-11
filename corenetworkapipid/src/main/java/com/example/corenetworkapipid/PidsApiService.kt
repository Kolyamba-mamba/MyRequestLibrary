package com.example.corenetworkapipid

import retrofit2.http.GET
import retrofit2.http.Query

interface PidsApiService{

    @GET("pids")
    suspend fun getAllPids():List<PidResponse>

    @GET("pid")
    suspend fun getPidById(
        @Query("id") id: Int
    ): PidResponse
}