package io.autodevice.gradle.demo

import android.app.Activity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
        }
        layout.addView(TextView(this).apply {
            text = "GradleDemo"
            textSize = 28f
            gravity = Gravity.CENTER
        })
        layout.addView(TextView(this).apply {
            text = "Built with Gradle"
            textSize = 16f
            gravity = Gravity.CENTER
        })
        setContentView(layout)
    }
}
