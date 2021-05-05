package com.example.activitybasedviewmodel.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.activitybasedviewmodel.MainActivityViewModel
import com.example.activitybasedviewmodel.R
import kotlinx.android.synthetic.main.first_fragment_layout.*
import kotlinx.android.synthetic.main.second_fragment_layout.*

class SecondFragment : Fragment(R.layout.second_fragment_layout) {

    val viewModel  by activityViewModels<MainActivityViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_second_fragment.setText(viewModel.second_fragment)
    }

    override fun onPause() {
        super.onPause()
        viewModel.set_second_fragment_et(et_second_fragment.text.toString())
    }
}