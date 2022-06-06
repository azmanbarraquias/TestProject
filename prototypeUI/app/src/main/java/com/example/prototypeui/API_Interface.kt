package com.example.prototypeui

import retrofit2.Call
import retrofit2.http.GET

interface API_Interface {

    @GET("posts")
    fun getData() : Call<List<MyData>>

}