package com.example.homework

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var listOfColors = listOf("#FFBB86FC","#FF6200EE","#FF3700B3","#FF03DAC5",
        "#FF018786","#FF000000","#FFFFFFFF","#C6BBD5","#FF0F07")
        view1.setOnClickListener {
            view1.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view2.setOnClickListener {
            view2.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view3.setOnClickListener {
            view3.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view4.setOnClickListener {
            view4.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view5.setOnClickListener {
            view5.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view6.setOnClickListener {
            view6.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view7.setOnClickListener {
            view7.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view8.setOnClickListener {
            view8.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
        view9.setOnClickListener {
            view9.setBackgroundColor(Color.parseColor(listOfColors.random()))
        }
    }
}