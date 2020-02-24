package com.nordstrom.app.astefviewmodel.ui.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.*
import androidx.navigation.fragment.findNavController
import com.nordstrom.app.astefviewmodel.R
import kotlinx.android.synthetic.main.result_filter_select_fragment.*

class ResultFilterSelectFragment : Fragment() {

    private lateinit var viewModel: ResultFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.result_filter_select_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModelStoreOwner = (parentFragment ?: activity) as ViewModelStoreOwner
        viewModel = ViewModelProvider(viewModelStoreOwner).get(ResultFragmentViewModel::class.java)

        viewResult.setOnClickListener {
            findNavController().navigate(R.id.action_resultFilterSelectFragment_to_resultFragment)
        }

        viewModel.someText.observe(this as LifecycleOwner, Observer {
            Log.d("ABC", "ResultFilterSelectFragment $it")
        })

        viewModel.someText.value = "Hello from ResultFilterSelectFragment " + System.currentTimeMillis()
    }
}
