package com.example.cai15films


import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cai15films.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding  //defining the binding class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //initializing the binding class
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }
        binding.button2.setOnClickListener {
            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
        }
        binding.button3.setOnClickListener {
            Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
        }
        binding.button4.setOnClickListener {
            Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
        }
        binding.button5.setOnClickListener {
            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        }


    }

}