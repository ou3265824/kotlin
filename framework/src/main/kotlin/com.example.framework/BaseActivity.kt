package com.kotlin.framework

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.framework.R

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}
