package com.example.hibiscus_tab

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

class Custom_Tab @JvmOverloads constructor(
    context: Context, attributeSet: AttributeSet?, defStyle: Int = 0
) : LinearLayout(context, attributeSet, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_tab, this, true)
        orientation = HORIZONTAL

        tabOnclick()
    }

    fun tabOnclick() {
        val tabSelected = findViewById<Custom_Tab_Selected>(R.id.customTab_selected)

        findViewById<CustomIcon>(R.id.tab1).setOnClickListener {
            tabSelected.apply {
                setResources(0)
                animate().translationX(0.0f).duration = 400
            }
        }
        findViewById<CustomIcon>(R.id.tab2).setOnClickListener {
            tabSelected.apply {
                setResources(1)
                animate().translationX(210.0f).duration = 400
            }
        }
        findViewById<CustomIcon>(R.id.tab3).setOnClickListener {
            tabSelected.apply {
                setResources(2)
                animate().translationX(490.0f).duration = 400
            }
        }
        findViewById<CustomIcon>(R.id.tab4).setOnClickListener {
            tabSelected.apply {
                setResources(3)
                animate().translationX(780.0f).duration = 400
            }
        }
    }
}