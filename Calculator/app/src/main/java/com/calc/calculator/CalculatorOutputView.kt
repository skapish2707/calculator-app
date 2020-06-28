package com.calc.calculator

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import java.util.jar.Attributes

class CalculatorOutputView(context: Context, attributeSet: AttributeSet?) : LinearLayout(context, attributeSet){
    init {
        //set orientation
        orientation = VERTICAL
        //set gravity
        gravity = Gravity.CENTER_VERTICAL

        //Inflate Layout
        LayoutInflater.from(context).inflate(R.layout.view_calc_output, this, true)
    }

}