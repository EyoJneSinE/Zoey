package com.eniskaner.zoeyimprovekids.view.secondquestionfragment

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.Navigation
import com.eniskaner.zoeyimprovekids.R
import com.eniskaner.zoeyimprovekids.databinding.FragmentSecondQuestionBinding

class SecondQuestionFragment : Fragment() {
    private lateinit var binding: FragmentSecondQuestionBinding
    val responses = arguments?.getStringArrayList("responses")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            var respectClicked = false
            respectText.setOnClickListener {
                if (!respectClicked) {
                    respectText.background = ColorDrawable(Color.parseColor("#80deea"))
                    respectClicked = true
                    responses?.add("Respect")
                } else {
                    respectText.background = ColorDrawable(Color.WHITE)
                    respectClicked = false
                    responses?.remove("Respect")
                }
                respectText.isClickable = true
            }

            var patienceClicked = false
            patienceText.setOnClickListener {
                if (!patienceClicked) {
                    patienceText.background = ColorDrawable(Color.parseColor("#80deea"))
                    patienceClicked = true
                    responses?.add("Patience")
                } else {
                    patienceText.background = ColorDrawable(Color.WHITE)
                    patienceClicked = false
                    responses?.remove("Patience")
                }
                patienceText.isClickable = true
            }

            var sharingClicked = false
            sharingText.setOnClickListener {
                if (!sharingClicked) {
                    sharingText.background = ColorDrawable(Color.parseColor("#80deea"))
                    sharingClicked = true
                    responses?.add("Sharing")
                } else {
                    sharingText.background = ColorDrawable(Color.WHITE)
                    sharingClicked = false
                    responses?.remove("Sharing")
                }
                sharingText.isClickable = true
            }

            continueButton.setOnClickListener {
                val action = SecondQuestionFragmentDirections.actionSecondQuestionFragmentToGenerateFragment()
                Navigation.findNavController(view).navigate(action)
            }
        }
    }

}