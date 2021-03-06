package com.nordstrom.app.astefviewmodel.ui.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.*
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.nordstrom.app.astefviewmodel.R
import kotlinx.android.synthetic.main.result_fragment.*

class ResultFragment : Fragment() {

    private lateinit var viewModel: ResultFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.result_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModelStoreOwner = (parentFragment ?: activity) as ViewModelStoreOwner
        viewModel = ViewModelProvider(viewModelStoreOwner).get(ResultFragmentViewModel::class.java)

        // TODO: Use the ViewModel

        viewModel.someText.observe(this as LifecycleOwner, Observer {
            Log.d("ABC", "ResultFragment $it")
        })

        filter.setOnClickListener {
            findNavController().navigate(R.id.action_resultFragment_to_resultFilterFragment)
        }

        Log.d("ABC", "ResultFragment onViewCreated. Value=" + viewModel.someText.value)
    }

    override fun onResume() {
        super.onResume()

        Log.d("ABC", "ResultFragment onResume")
    }



}
