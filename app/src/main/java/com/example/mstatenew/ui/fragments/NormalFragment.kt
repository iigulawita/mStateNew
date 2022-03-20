package com.example.mstatenew.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mstatenew.databinding.FragmentNormalBinding


class NormalFragment : Fragment() {

    private var _binding: FragmentNormalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNormalBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        binding.btnOkay.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}