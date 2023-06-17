package com.main.blockify.core.di

import com.main.blockify.core.domain.DispatchersList
import org.koin.dsl.module

val coreModule = module {
    single<DispatchersList> { DispatchersList.Base() }
}
