package com.coretechm.dev.mylibrary01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.addCallback
import androidx.navigation.fragment.NavHostFragment
import com.coretechm.dev.mylibrary01.databinding.FragmentSecondBinding
import com.google.android.material.snackbar.Snackbar

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navController = NavHostFragment.findNavController(this)

        requireActivity().onBackPressedDispatcher.addCallback(this) {
            Snackbar.make(binding.root, "back button ignore", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)

        return binding.root
    }
}