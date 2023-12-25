package com.ulduzis.uicomponents.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ulduzis.uicomponents.R
import com.ulduzis.uicomponents.databinding.FragmentAddBinding
import com.ulduzis.uicomponents.databinding.FragmentDetailsBinding


class AddFragment : Fragment() {

    private lateinit var  binding: FragmentAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(inflater)

        // Inflate the layout for this fragment
        return binding.root
    }

}