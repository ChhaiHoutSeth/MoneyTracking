package com.moneytracking.ui.home

import android.os.Bundle
import android.view.View
import com.moneytracking.R
import com.moneytracking.base.BaseFragment
import com.moneytracking.databinding.FragmentDailyBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment: BaseFragment<FragmentDailyBinding>(R.layout.fragment_home) {

    private val viewModel by viewModel<HomeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = viewModel
    }
}