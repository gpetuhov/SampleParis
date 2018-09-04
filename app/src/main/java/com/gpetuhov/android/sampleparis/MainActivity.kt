package com.gpetuhov.android.sampleparis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.paris.Paris
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloText.setOnClickListener {
            // The simplest way to set style from XML
            Paris.style(helloText).apply(R.style.RedTextStyle)

            // And also we can define style programmatically
            Paris.styleBuilder(helloText)
                    .textSizeDp(30)
                    .apply()
        }
    }
}
