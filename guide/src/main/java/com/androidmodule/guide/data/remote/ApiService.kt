package com.androidmodule.guide.data.remote

import com.androidmodule.guide.domain.GuideModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("guide/apps")
    suspend fun getData(
        @Query("packageName") packageName: String?
    ): GuideModel
}