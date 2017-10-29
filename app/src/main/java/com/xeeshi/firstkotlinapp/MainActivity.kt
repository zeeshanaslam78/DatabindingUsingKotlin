package com.xeeshi.firstkotlinapp

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xeeshi.firstkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //var a: String?

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,
                R.layout.activity_main)

        binding.repositoryName.text = "Android Medium Article"
    }
}
