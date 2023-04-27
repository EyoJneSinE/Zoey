package com.eniskaner.zoeyimprovekids.view.firstquestionfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.eniskaner.zoeyimprovekids.R
import com.eniskaner.zoeyimprovekids.databinding.FragmentFirstQuestionBinding

class FirstQuestionFragment : Fragment() {
    private lateinit var binding: FragmentFirstQuestionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            answerThreeText.setOnClickListener {
                val action = FirstQuestionFragmentDirections.actionFirstQuestionFragmentToSecondQuestionFragment()
                Navigation.findNavController(it).navigate(action)
            }
            answerFourText.setOnClickListener {
                val action = FirstQuestionFragmentDirections.actionFirstQuestionFragmentToSecondQuestionFragment()
                Navigation.findNavController(it).navigate(action)
            }
        }
    }



}