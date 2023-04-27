package com.eniskaner.zoeyimprovekids.view.openingfragmet

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eniskaner.zoeyimprovekids.R

class OpeningFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_opening, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        object : CountDownTimer(5000,1000) {
            override fun onTick(millisUntilFinished: Long) {

            }
            override fun onFinish() {
                val action = OpeningFragmentDirections.actionOpeningFragmentToFirstQuestionFragment()
                Navigation.findNavController(view).navigate(action)
            }
        }.start()





    }

}