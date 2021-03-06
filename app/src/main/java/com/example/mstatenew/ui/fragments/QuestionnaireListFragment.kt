package com.example.mstatenew.ui.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mstatenew.R
import com.example.mstatenew.databinding.FragmentQuestionnaireListBinding
import com.google.firebase.Timestamp

class QuestionnaireListFragment : Fragment() {

    private var _binding: FragmentQuestionnaireListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuestionnaireListBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        disableTestButtons()
        binding.btnPhq.setOnClickListener {
            findNavController().navigate(R.id.action_questionnaire_to_phq)
        }
        binding.btnEpds.setOnClickListener {
            findNavController().navigate(R.id.action_questionnaire_to_epds)
        }
    }


    private fun disableTestButtons() {

        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        val prefValue = sharedPref.getLong(getString(R.string.pref_today_timestamp), 0)

        val savedTimestamp = Timestamp(prefValue, 0)

        if (savedTimestamp.seconds != 0L) {

            val nextTestAvailabilityTimestamp =
                Timestamp(savedTimestamp.seconds + SECONDS_FOR_DAY, 0)

            Log.d(
                TAG,
                "Saved: ${savedTimestamp.seconds}, Next: ${nextTestAvailabilityTimestamp.seconds}"
            )

            if (savedTimestamp.seconds < nextTestAvailabilityTimestamp.seconds) {
                binding.btnPhq.isEnabled = false
                binding.btnPhq.alpha = 0.5f
                binding.btnEpds.isEnabled = false
                binding.btnEpds.alpha = 0.5f
            } else {
                binding.btnPhq.isEnabled = true
                binding.btnPhq.alpha = 1f
                binding.btnEpds.isEnabled = true
                binding.btnEpds.alpha = 1f

            }
        }
    }

    override fun onResume() {
        super.onResume()
        disableTestButtons()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val SECONDS_FOR_DAY: Long = 86400
        const val TAG: String = "QuestionnaireListFrag"
    }
}