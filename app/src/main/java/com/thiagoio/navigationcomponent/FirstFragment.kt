package com.thiagoio.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation


class FirstFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

       view.findViewById<TextView>(R.id.textOne).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment) }

        return view

    }

    }
