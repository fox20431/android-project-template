package com.hihusky.lib

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import kotlin.math.log

const val TAG = "test"

class CustomView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomView)
        val string = typedArray.getString(R.styleable.CustomView_stringContent)
        val integer = typedArray.getInteger(R.styleable.CustomView_integerContent, -1)
        Log.d(TAG, """
            The view attrs
            R.styleable.CustomView_stringContent:   $string
            R.styleable.CustomView_integerContent:  $integer
        """.trimIndent())
        typedArray.recycle()
    }
}