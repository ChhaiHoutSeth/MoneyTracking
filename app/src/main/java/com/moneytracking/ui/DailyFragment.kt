package com.moneytracking.ui

import com.moneytracking.R
import com.moneytracking.base.BaseFragment
import com.moneytracking.databinding.FragmentDailyBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DailyFragment: BaseFragment<FragmentDailyBinding>(R.layout.fragment_daily) {

    private val viewModel by viewModel<DailyViewModel>()
}