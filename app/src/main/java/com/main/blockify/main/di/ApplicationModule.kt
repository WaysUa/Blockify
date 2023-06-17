package com.main.blockify.main.di

import com.main.blockify.main.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val applicationModule = module {
    viewModel {
        MainViewModel(
            dataStoreRepository = get(),
            dispatchers = get(),
        )
    }
}
