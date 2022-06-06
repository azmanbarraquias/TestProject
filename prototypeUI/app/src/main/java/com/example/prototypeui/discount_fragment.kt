package com.example.prototypeui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class discount_fragment : Fragment() {

    val BASE_URL = "https://jsonplaceholder.typicode.com/posts/1/"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.discount_fragment, container, false)
    }

    private fun GetMyData() {

        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(API_Interface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<MyData>?> {
            override fun onResponse(call: Call<List<MyData>?>, response: Response<List<MyData>?>) {
                val responseBody = response.body()!!

                for (MyData in responseBody) {
                    Log.d(context.toString(), "Content" + MyData.id)
                }
            }

            override fun onFailure(call: Call<List<MyData>?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

    }
}