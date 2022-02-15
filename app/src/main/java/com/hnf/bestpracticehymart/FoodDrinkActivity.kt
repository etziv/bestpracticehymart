package com.hnf.bestpracticehymart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_drink.*

class FoodDrinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_drink)

        setSupportActionBar(toolbar_food)
        val actbar = supportActionBar
        actbar!!.title = "Makanan & minuman"
        actbar.setDisplayHomeAsUpEnabled(true)
        actbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}