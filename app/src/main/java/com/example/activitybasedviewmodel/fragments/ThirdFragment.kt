package com.example.activitybasedviewmodel.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.activitybasedviewmodel.MainActivityViewModel
import com.example.activitybasedviewmodel.R
import kotlinx.android.synthetic.main.first_fragment_layout.*
import kotlinx.android.synthetic.main.third_fragment_layout.*

class ThirdFragment : Fragment(R.layout.third_fragment_layout) {

    val viewModel  by activityViewModels<MainActivityViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_third_fragment.setText(viewModel.third_fragment)
    }

    override fun onPause() {
        super.onPause()
        viewModel.set_third_fragment_et(et_third_fragment.text.toString())
    }
}