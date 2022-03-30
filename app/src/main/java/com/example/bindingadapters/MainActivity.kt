package com.example.bindingadapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)

        val postvar= Post("Title",
            "description",
            "https://ayusch.com/wp-content/uploads/2018/09/profile.png")

        binding.postDataVariable= postvar
    }
}