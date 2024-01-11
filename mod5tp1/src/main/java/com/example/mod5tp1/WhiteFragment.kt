package com.example.mod5tp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class WhiteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_white, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonWhite).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.whiteToRed)
        }

        view.findViewById<Button>(R.id.buttonWhite).setOnLongClickListener {
            Navigation.findNavController(view).navigate(R.id.whiteToGreen)
            return@setOnLongClickListener true
        }
    }


}