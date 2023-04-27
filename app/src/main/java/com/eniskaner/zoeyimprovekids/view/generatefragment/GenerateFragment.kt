package com.eniskaner.zoeyimprovekids.view.generatefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eniskaner.zoeyimprovekids.R
import com.eniskaner.zoeyimprovekids.databinding.FragmentGenerateBinding

class GenerateFragment : Fragment() {
    private lateinit var binding: FragmentGenerateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGenerateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            generateButton.setOnClickListener {
                //val action = GenerateFragmentDirections.actionGenerateFragmentToAnswerFragment()
               // Navigation.findNavController(view).navigate(action)
            }
        }

    }

}