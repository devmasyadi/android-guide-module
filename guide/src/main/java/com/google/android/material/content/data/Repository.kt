package com.google.android.material.content.data

import com.google.android.material.content.data.remote.ApiService
import com.google.android.material.content.domain.GuideModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class Repository(
    private val apiService: ApiService
) : IRepository {
    override fun getData(appId: String, content: String): Flow<Resource<GuideModel>> {
        return flow {
            try {
                emit(Resource.Loading())
                val result = apiService.getData(appId, content)
                emit(Resource.Success(result))
            } catch (e: Exception) {
                emit(Resource.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }
}