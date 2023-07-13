package com.example.laptopguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.laptopguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()


        binding.ibWindow.setOnClickListener{
            intent = Intent(this, WindowsLaptop::class.java)
            startActivity(intent)
        }

        binding.ibMac.setOnClickListener {
            intent = Intent(this, IosLaptop::class.java)
            startActivity(intent)
        }



    }


}
