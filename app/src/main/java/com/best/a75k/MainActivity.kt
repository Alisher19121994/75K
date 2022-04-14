package com.best.a75k

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textBtn)
        getDetails()
    }

    private fun getDetails() {
        val text = "Please, visit this social media sites #Twitter and #Instagram"
        val spannable = SpannableString(text)
        val pattern = Pattern.compile("#([A-Za-z0-9_-]+)").matcher(text)
        while (pattern.find()) {
            spannable.setSpan(ForegroundColorSpan(Color.GREEN), pattern.start(), pattern.end(), 0)
        }
        textView.text = spannable
    }

}