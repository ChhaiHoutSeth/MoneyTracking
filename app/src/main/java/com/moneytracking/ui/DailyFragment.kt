package com.moneytracking.ui

import android.os.Bundle
import android.view.View
import com.moneytracking.R
import com.moneytracking.base.BaseFragment
import com.moneytracking.databinding.FragmentDailyBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DailyFragment: BaseFragment<FragmentDailyBinding>(R.layout.fragment_daily) {

    private val viewModel by viewModel<DailyViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = viewModel
    }
}