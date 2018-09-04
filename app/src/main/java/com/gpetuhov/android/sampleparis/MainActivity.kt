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
            Paris.style(helloText).apply(R.style.RedTextStyle)
        }
    }
}
