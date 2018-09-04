package com.gpetuhov.android.sampleparis.view

import android.content.Context
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import com.airbnb.paris.annotations.Style
import com.airbnb.paris.annotations.Styleable
import com.gpetuhov.android.sampleparis.R

// Here we link style to view
@Styleable
class MyButton2 : AppCompatButton {

    // Linked style must be in a static field.
    // In Kotlin we use companion object for that.
    companion object {
        // For styles defined in XML.
        // For static fields use JvmField! We must use it, so that the field will be static in Java.
        @JvmField
        @Style
        val RED_STYLE = R.style.RedButtonStyle  // style is defined in in res/values/styles.xml
    }

    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle)
}