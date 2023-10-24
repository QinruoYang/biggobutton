package edu.uw.ischool.qy54.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var pushCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pushButton: Button = findViewById(R.id.pushButton)
        pushButton.setOnClickListener {
            pushCount++
            updateButtonText()
        }
    }

    private fun updateButtonText() {
        val pushButton: Button = findViewById(R.id.pushButton)
        val text = when (pushCount) {
            1 -> getString(R.string.pushed_once, pushCount)
            else -> getString(R.string.pushed_multiple, pushCount)
        }
        pushButton.text = text
    }
}