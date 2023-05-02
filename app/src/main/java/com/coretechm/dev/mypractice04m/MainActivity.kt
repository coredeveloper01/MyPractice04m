package com.coretechm.dev.mypractice04m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.coretechm.dev.mylibrary01.MyLibrary01_Activity
import com.coretechm.dev.mypractice04m.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btn01.setOnClickListener(this)

        popMessage("hello")

        val data = "data shit"

    }

    override fun onResume() {
        super.onResume()
        //popMessage("hello dev world")

        println((binding.root is View).toString())

        Snackbar.make(binding.root, "snackBar", Snackbar.LENGTH_SHORT).show()
    }

    override fun onClick(p0: View?) {
        val result = when(p0?.id) {
            R.id.btn01 -> {
                startActivity(Intent(this, MyLibrary01_Activity::class.java))
                0
            }
            else -> {
                100
            }
        }

        if(result === 100) popMessage("empty message!!")
    }

    val popMessage: (String) -> Unit = {
        Toast.makeText(this, it ?: "empty message", Toast.LENGTH_SHORT).show()
    }
}