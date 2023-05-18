package com.sanjaysargam.hackerrank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.graphics.Typeface
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
//        val textView = findViewById<TextView>(R.id.hackerRankTV) // Replace `myTextView` with your TextView's ID
//        val customFont = loadFont(this, "fonts/chronicapro_black.ttf") // Replace `YourCustomFont.ttf` with your actual font file name and extension
//        textView.typeface = customFont

    }
    private fun loadFont(context: Context, fontPath: String): Typeface {
        return Typeface.createFromAsset(context.assets, fontPath)
    }
}