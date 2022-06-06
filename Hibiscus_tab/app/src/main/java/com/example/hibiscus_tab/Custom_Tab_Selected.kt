package com.example.hibiscus_tab

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class Custom_Tab_Selected @JvmOverloads constructor(
    context: Context, attributeSet: AttributeSet?, defStyle: Int = 0
) : LinearLayout(context, attributeSet, defStyle) {
    val tabData: ArrayList<tab_data> = ArrayList()

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_tab_selected, this, true)
        insertFakeData()
    }

    fun setResources(position: Int) {
        findViewById<ImageView>(R.id.tabImage).setImageResource(tabData[position].image)
        findViewById<TextView>(R.id.tabText).text = tabData[position].tabTitle
    }

    fun insertFakeData() {
        //Fake insert data
        tabData.add(tab_data(R.drawable.ic_android, "Tab 1"))
        tabData.add(tab_data(R.drawable.ic_android, "Tab 2"))
        tabData.add(tab_data(R.drawable.ic_android, "Tab 3"))
        tabData.add(tab_data(R.drawable.ic_android, "Tab 4"))
    }
}