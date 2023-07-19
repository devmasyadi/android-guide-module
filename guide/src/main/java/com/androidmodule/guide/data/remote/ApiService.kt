package com.androidmodule.guide.data.remote

import com.androidmodule.guide.domain.GuideModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("apps")
    suspend fun getData(
        @Query("appId") appId: String?,
        @Query("content") content: String?
    ): GuideModel
}