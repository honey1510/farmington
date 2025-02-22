package com.georgian.farmington

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val agriNewsButtonVar: Button = findViewById (R.id.agrinewsButton)
        agriNewsButtonVar.setOnClickListener()
        {
            val intent = Intent(this, AgriNewsHomeActivity::class.java)
            startActivity(intent)
        }

        val weatherButtonVar: Button = findViewById (R.id.weatherButton)
        weatherButtonVar.setOnClickListener()
        {
            val intent = Intent(this, WeatherActivity::class.java)
            startActivity(intent)
        }

        val profileButtonVar: ImageButton = findViewById (R.id.profileButton)
        profileButtonVar.setOnClickListener()
        {
            val intent = Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
        }

    }
}