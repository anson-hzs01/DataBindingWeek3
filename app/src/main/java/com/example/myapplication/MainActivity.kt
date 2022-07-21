package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Student s;
    //var s: Student
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main)

        var student = Student("Ali", "RIT", 20)

        binding.btnGetValue.setOnClickListener{
            binding.myData = student

        }

        binding.btnSetValue.setOnClickListener {
            student.age = 28
//            student.name = "Anson Ho Zhi Sian"
//            student.programme= "RIS"

            binding.apply {
                invalidateAll()
            }
        }
        //var btn = findViewById<Button>(R.id.btnGetValue)


    }
}