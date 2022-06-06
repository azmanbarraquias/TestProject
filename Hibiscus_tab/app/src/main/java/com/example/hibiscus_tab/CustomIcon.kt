package com.example.hibiscus_tab

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout

class CustomIcon @JvmOverloads constructor(
    context: Context, attributeSet: AttributeSet?, defStyle: Int = 0
) : ConstraintLayout(context, attributeSet, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_icon, this, true)
    }
}