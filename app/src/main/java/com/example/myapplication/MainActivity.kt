package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aniketkotlin.ToastManager

private lateinit var toastManager: ToastManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toastManager = ToastManager()
        toastManager.showShortToast(this,"Library Toast")

    }
}