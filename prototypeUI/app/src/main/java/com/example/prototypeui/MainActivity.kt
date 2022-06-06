package com.example.prototypeui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<hax_view_pager>(R.id.haxViewPage).onPreparedViewPager(supportFragmentManager)
    }




}