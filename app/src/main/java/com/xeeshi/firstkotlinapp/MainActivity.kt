package com.xeeshi.firstkotlinapp

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.xeeshi.firstkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //var a: String?

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,
                R.layout.activity_main)

        //binding.repositoryName.text = "Android Medium Article"

        /*binding.apply {
            repositoryName.text = "Android Medium Article"
            repositoryOwner.text = "Xeeshi"
            numberOfStarts.text = "200 stars"
        }*/

        var repository = Repository("Android Medium Article",
                "Xeeshi", "200 stars", true)

        binding.repository = repository
        binding.executePendingBindings()

        Handler().postDelayed({repository.repositoryName="Android Kotlin App" }, 5000)
        Handler().postDelayed({repository.repositoryOwner="Zeeshan"}, 7000)
        Handler().postDelayed({repository.numberOfStars="1000 stars"}, 9000)

    }
}
