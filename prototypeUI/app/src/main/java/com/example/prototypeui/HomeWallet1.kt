package com.example.prototypeui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout

class HomeWallet1 @JvmOverloads constructor(
    context: Context, attrs: AttributeSet, defStyle: Int = 0
) : ConstraintLayout(context, attrs, defStyle) {

    init {
        ObtainAttributes(context, attrs)
    }

    private fun ObtainAttributes(context: Context, attrs: AttributeSet) {
        LayoutInflater.from(context).inflate(R.layout.home_wallet, this, true)
    }
}