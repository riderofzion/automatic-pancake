package com.example.mod5tp1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class RedFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonRed).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.redToPurple)
        }

        view.findViewById<Button>(R.id.buttonRed).setOnLongClickListener {
            Navigation.findNavController(view).navigate(R.id.redToBlue)
            //permet le retour arrière
            //Navigation.findNavController(view).popBackStack()
            return@setOnLongClickListener true
        }
    }
}