package com.androidmodule.guide.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class GuideModel(

    @field:SerializedName("isOverrideImage")
    val isOverrideImage: Boolean? = null,

    @field:SerializedName("imageOverride")
    val imageOverride: String? = null,

    @field:SerializedName("_id")
    val id: String? = null,

    @field:SerializedName("packageName")
    val packageName: String? = null,

    @field:SerializedName("content")
    val content: List<ContentItem?>? = null
) : Parcelable

@Parcelize
data class ContentItem(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("subTitle")
    val subTitle: String? = null,

    @field:SerializedName("details")
    val details: String? = null,

    @field:SerializedName("_id")
    val id: String? = null,

    @field:SerializedName("title")
    val title: String? = null
) : Parcelable
