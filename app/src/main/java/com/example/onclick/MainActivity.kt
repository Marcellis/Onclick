package com.example.onclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onclick.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var people: ArrayList <Person> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun generatePeople(){
        people.addAll(
        listOf (
            Person ("s ", " s"),
            Person ("s ", " s"),
            Person ("s ", " s"),
            Person ("s ", " s")
        )
        )
    }
}