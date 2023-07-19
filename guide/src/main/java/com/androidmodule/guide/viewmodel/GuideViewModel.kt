package com.androidmodule.guide.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.androidmodule.guide.data.Repository

class GuideViewModel(private val repository: Repository) : ViewModel() {
    fun getData(appId: String, content: String) = repository.getData(appId, content).asLiveData()
}