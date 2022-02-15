package com.hnf.bestpracticehymart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_baby.*
import kotlinx.android.synthetic.main.activity_food_drink.*

class BabyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baby)

        setSupportActionBar(toolbar_baby)
        val actbar = supportActionBar
        actbar!!.title = "Ibu & Anak"
        actbar.setDisplayHomeAsUpEnabled(true)
        actbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}