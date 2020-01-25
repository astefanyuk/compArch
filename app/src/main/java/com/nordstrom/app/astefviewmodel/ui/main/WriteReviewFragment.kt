package com.nordstrom.app.astefviewmodel.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.nordstrom.app.astefviewmodel.R

class WriteReviewFragment : Fragment() {

    companion object {
        fun newInstance() = WriteReviewFragment()
    }

    private lateinit var viewModel: WriteReviewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WriteReviewViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
