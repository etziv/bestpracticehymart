package com.hnf.bestpracticehymart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_drink.*
import kotlinx.android.synthetic.main.activity_healthy.*

class HealthyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthy)

        setSupportActionBar(toolbar_healthy)
        val actbar = supportActionBar
        actbar!!.title = "Kesehatan & Kecantikan"
        actbar.setDisplayHomeAsUpEnabled(true)
        actbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}