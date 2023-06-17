package com.main.blockify.main.app

import android.app.Application
import com.main.blockify.core.di.coreModule
import com.main.blockify.datasource.di.dataStoreModule
import com.main.blockify.main.di.applicationModule
import com.main.feat_onboarding.di.onBoardingModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class CryptoTrackingApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@CryptoTrackingApplication)
            modules(
                listOf(
                    onBoardingModule,
                    applicationModule,
                    dataStoreModule,
                    coreModule,
                ),
            )
        }
    }
}
