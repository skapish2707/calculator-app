package com.calc.calculator

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout

class CalculatorInputView (context: Context, attributeSet: AttributeSet?):RelativeLayout(context, attributeSet){
    init {
        //Inflate Layout
        LayoutInflater.from(context).inflate(R.layout.view_calc_output, this, true)

        //read attribute set
        attributeSet?.run {
            val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CalculatorInputView)

            val textResource = typedArray.getString(R.styleable.CalculatorInputView_item_text)

            val iconResource = typedArray.getResourceId(R.styleable.CalculatorInputView_item_icon, -1)
            

        }
    }
}