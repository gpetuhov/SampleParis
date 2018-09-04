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
            // The simplest way to set style from XML (from res/values/styles.xml)
            Paris.style(helloText).apply(R.style.RedTextStyle)

            // And also we can define style programmatically
            Paris.styleBuilder(helloText)
                    .textSizeDp(30)
                    .apply()
        }

        button.setOnClickListener {
            // To change custom view attributes, use Paris from our project, not from the library!
            com.gpetuhov.android.sampleparis.Paris.styleBuilder(button)
                    .myButtonTitle("MyButton")
                    .myButtonBackground(R.color.md_red_900)
                    .apply()
        }

        button2.setOnClickListener {
            // To use view with linked style, we must use Paris from the project, not from the library
            com.gpetuhov.android.sampleparis.Paris.style(button2)
                    .applyRed()     // this method is generated for the linked style
        }
    }
}
