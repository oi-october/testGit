package com.xieql.testgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xieql.lib.test.Test1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Test1().a()
    }
}