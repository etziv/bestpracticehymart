package com.hnf.bestpracticehymart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_drink.*
import kotlinx.android.synthetic.main.activity_house.*

class HouseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house)

        setSupportActionBar(toolbar_house)
        val actbar = supportActionBar
        actbar!!.title = "Rumah & Dapur"
        actbar.setDisplayHomeAsUpEnabled(true)
        actbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}