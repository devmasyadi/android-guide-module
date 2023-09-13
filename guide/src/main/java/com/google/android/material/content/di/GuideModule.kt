package com.google.android.material.content.di

import com.google.android.material.content.data.Repository
import com.google.android.material.content.data.remote.ApiService
import com.google.android.material.content.viewmodel.GuideViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val guideModule = module(override = true) {
    single {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.NONE)

        OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .connectTimeout(5, TimeUnit.MINUTES)
            .readTimeout(5, TimeUnit.MINUTES)
            .build()
    }

    single {
        val retrofit = GuideStyle.style?.let { url ->
            Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(get())
                .build()
        }
        retrofit?.create(ApiService::class.java)
    }

    single { Repository(get()) }
    viewModel { GuideViewModel(get()) }
}

object GuideStyle {
    var style: String? = null
}