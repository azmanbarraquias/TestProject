package com.example.prototypeui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class hax_view_pager @JvmOverloads constructor(context: Context, attributeSet: AttributeSet?, defStyle: Int = 0
):ConstraintLayout(context,attributeSet,defStyle) {
    init
    {
        LayoutInflater.from(context).inflate(R.layout.hax_view_pager, this,true)
    }

    fun onPreparedViewPager(supportFragmentManager: FragmentManager)
    {
        val tabLayout = findViewById<TabLayout>(R.id.TabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(live_fragment(), "Live")
        adapter.addFragment(discount_fragment(), "DIscount")
        adapter.addFragment(vip_fragment(), "VIP")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }

}