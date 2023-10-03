package com.example.flixsterplus

import com.google.gson.annotations.SerializedName

class Movie {

    @JvmField
    @SerializedName("original_title")
    var title: String? = null

    @JvmField
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null


}