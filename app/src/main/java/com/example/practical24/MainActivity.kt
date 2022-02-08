package com.example.practical24

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.practical24.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val s = Student("W123","John")

        binding.myData = s
        //binding.tvTextFieldName.text = "W123456"

        binding.btnUpdate.setOnClickListener(){
            s.studentName = "Peter"

            binding.apply {
                invalidateAll()
            }
        }
    }
}