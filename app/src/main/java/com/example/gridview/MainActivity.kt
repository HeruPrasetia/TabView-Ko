package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        tabs_main.setupWithViewPager(viewpager_main)
        viewpager_main.adapter = Adapter(supportFragmentManager)
    }
}
