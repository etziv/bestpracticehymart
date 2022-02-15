package com.hnf.bestpracticehymart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        toolbar.setNavigationOnClickListener {
            Toast.makeText(this, "Menu",Toast.LENGTH_SHORT).show()
        }

        card_makan.setOnClickListener {
            val intent = Intent(this ,FoodDrinkActivity::class.java)
            startActivity(intent)
        }

        card_rumah.setOnClickListener {
            val intent = Intent(this ,HouseActivity::class.java)
            startActivity(intent)
        }

        card_bayi.setOnClickListener {
            val intent = Intent(this ,BabyActivity::class.java)
            startActivity(intent)
        }

        card_kesehatan.setOnClickListener {
            val intent = Intent(this ,HealthyActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.logout,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemview = item.itemId

        when(itemview){

            R.id.keluar -> Toast.makeText(applicationContext, "Keluar", Toast.LENGTH_SHORT).show()
        }
        return false
    }


}