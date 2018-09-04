package com.gpetuhov.android.sampleparis.view

import android.content.Context
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet
import com.airbnb.paris.annotations.Attr
import com.airbnb.paris.annotations.Styleable
import com.gpetuhov.android.sampleparis.R


// This is our own view with custom attributes.
// Don't forget to apply plugin: 'kotlin-kapt'
// and replace 'annotationProcessor' with 'kapt' in build.gradle!
// Custom attributes are declared in res/balues/attr.xml
@Styleable("MyButton")
class MyButton : AppCompatButton {

    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle) {
        // This call enables the custom attributes when used in XML layouts. It
        // extracts styling information from AttributeSet like it would a StyleRes.
        // Here we must use Paris class from our project, not from a library.
        com.gpetuhov.android.sampleparis.Paris.style(this).apply(attrs)
    }

    // Here we tell Paris, what to do, when custom attributes are used
    @Attr(R.styleable.MyButton_myButtonTitle)
    fun setTitle(title: String) {
        text = title
    }

    @Attr(R.styleable.MyButton_myButtonBackground)
    fun setBackground(color: Int) {
        setBackgroundColor(color)
    }
}