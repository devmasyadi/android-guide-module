package com.google.android.material.content.data

import com.google.android.material.content.domain.GuideModel
import kotlinx.coroutines.flow.Flow

interface IRepository {
    fun getData(appId: String, content: String): Flow<Resource<GuideModel>>
}