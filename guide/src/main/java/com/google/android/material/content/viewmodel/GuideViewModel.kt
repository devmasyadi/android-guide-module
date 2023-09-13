package com.google.android.material.content.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.google.android.material.content.data.Repository

class GuideViewModel(private val repository: Repository) : ViewModel() {
    fun getData(appId: String, content: String) = repository.getData(appId, content).asLiveData()
}