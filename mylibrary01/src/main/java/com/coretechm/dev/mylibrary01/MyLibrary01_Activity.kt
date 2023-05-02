package com.coretechm.dev.mylibrary01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.coretechm.dev.mylibrary01.databinding.ActivityMyLibrary01Binding

class MyLibrary01_Activity : AppCompatActivity() {

    val binding: ActivityMyLibrary01Binding by lazy {
        ActivityMyLibrary01Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*
        binding.butt.setOnClickListener {
            Toast.makeText(this, "message", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, FirstFragment::class.java ))
        }*/
    }
}