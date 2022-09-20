package com.androidmodule.guide.data

import com.androidmodule.guide.domain.GuideModel
import kotlinx.coroutines.flow.Flow

interface IRepository {
    fun getData(packageName: String): Flow<Resource<GuideModel>>
}