package com.moneytracking.di

import com.moneytracking.ui.DailyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

}

val viewModelModule = module {
    viewModel { DailyViewModel() }
}