package com.example.activitybasedviewmodel.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.activitybasedviewmodel.MainActivityViewModel
import com.example.activitybasedviewmodel.R
import kotlinx.android.synthetic.main.first_fragment_layout.*

class FirstFragment : Fragment(R.layout.first_fragment_layout) {

    val viewModel  by activityViewModels<MainActivityViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_first_fragment.setText(viewModel.first_fragment)
    }

    override fun onPause() {
        super.onPause()
        viewModel.set_first_fragment_et(et_first_fragment.text.toString())
    }
}

