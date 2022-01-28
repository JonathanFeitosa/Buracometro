package com.gabinetedoamom.buracometro.di

import com.gabinetedoamom.buracometro.ui.form.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeFeaturesModule = module {
    viewModel { HomeViewModel() }
}