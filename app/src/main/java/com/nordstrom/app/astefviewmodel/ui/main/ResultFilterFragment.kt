package com.nordstrom.app.astefviewmodel.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.nordstrom.app.astefviewmodel.R
import kotlinx.android.synthetic.main.result_filter_fragment.*

class ResultFilterFragment : Fragment() {

    private lateinit var viewModel: ResultFilterFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.result_filter_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ResultFilterFragmentViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewResult.setOnClickListener {
            findNavController().navigateUp()
        }

        filterSelect.setOnClickListener {
            findNavController().navigate(R.id.action_resultFilterFragment_to_resultFilterSelectFragment)
        }
    }

}
