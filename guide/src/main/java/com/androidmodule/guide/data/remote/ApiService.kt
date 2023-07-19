package com.androidmodule.guide.data.remote

import com.androidmodule.guide.domain.GuideModel
import retrofit2.http.Query

interface ApiService {
    suspend fun getData(
        @Query("appId") appId: String?,
        @Query("content") content: String?
    ): GuideModel
}