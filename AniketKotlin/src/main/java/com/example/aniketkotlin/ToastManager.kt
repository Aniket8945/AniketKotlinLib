package com.example.aniketkotlin

import android.content.Context
import android.widget.Toast

class ToastManager {
        fun s(c: Context?, message: String?) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
        }

}