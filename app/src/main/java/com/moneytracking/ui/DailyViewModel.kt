package com.moneytracking.ui

import androidx.lifecycle.ViewModel
import com.moneytracking.App
import com.moneytracking.R
import java.util.*

class DailyViewModel : ViewModel() {

    fun getGreetingText(): String {
        return when (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)) {
            in 5..12 -> App.context.getString(R.string.good_morning)
            in 12..18 -> App.context.getString(R.string.good_after_noon)
            else -> App.context.getString(R.string.good_evening)
        }
    }
}