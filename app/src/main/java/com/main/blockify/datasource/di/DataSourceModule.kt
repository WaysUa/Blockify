package com.main.blockify.datasource.di

import com.main.blockify.datasource.datastore.DataStoreRepository
import com.main.core_datasource.datastore.DataStoreRepositoryImpl
import org.koin.dsl.module

val dataStoreModule = module {
    single<DataStoreRepository> {
        DataStoreRepositoryImpl(context = get())
    }
}