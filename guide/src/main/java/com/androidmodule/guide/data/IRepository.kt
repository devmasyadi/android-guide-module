package com.androidmodule.guide.data

import com.androidmodule.guide.domain.GuideModel
import kotlinx.coroutines.flow.Flow

interface IRepository {
    fun getData(appId: String, content: String): Flow<Resource<GuideModel>>
}