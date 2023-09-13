package com.google.android.material.content.data.remote

import com.google.android.material.content.domain.GuideModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("apps")
    suspend fun getData(
        @Query("appId") appId: String?,
        @Query("content") content: String?
    ): GuideModel
}