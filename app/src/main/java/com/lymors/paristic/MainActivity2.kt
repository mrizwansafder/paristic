package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.lymors.paristic.R
import com.lymors.paristic.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews = listOf(
            binding.boxOneText, binding.boxTwoText, binding.boxThreeText,
            binding.boxFourText, binding.boxFiveText, binding.constraintLayout,
            binding.buttonRed, binding.buttonYellow, binding.buttonGreen
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
        binding.buttonRed.setOnClickListener { (makeRed()) }
        binding.buttonYellow.setOnClickListener { makeYellow() }
        binding.buttonGreen.setOnClickListener{makeGreen()}
    }

    private fun makeColored(view: View) {
        when (view) {
            binding.boxOneText, binding.boxTwoText, binding.boxThreeText ->
                view.setBackgroundResource(android.R.color.holo_purple)
            binding.boxFourText -> view.setBackgroundResource(android.R.color.holo_orange_light)
            binding.boxFiveText -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            binding.buttonRed -> view.setBackgroundResource(R.color.my_red)
            binding.buttonYellow -> view.setBackgroundResource(R.color.my_yellow)
            binding.buttonGreen -> view.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(titleColor)
        }

    }
    private fun makeRed() {
        binding.boxThreeText.setBackgroundResource(R.color.my_red)
    }

    private fun makeYellow() {
        binding.boxFourText.setBackgroundResource(R.color.my_yellow)
    }

    private fun makeGreen() {
        binding.boxFiveText.setBackgroundResource(R.color.my_green)
        }
}

