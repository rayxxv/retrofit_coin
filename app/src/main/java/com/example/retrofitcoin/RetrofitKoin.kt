package com.example.retrofitcoin

import android.app.Application
import com.example.retrofitcoin.di.networkModule
import com.example.retrofitcoin.di.viewModelModule
import com.example.retrofitcoin.di.RepositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RetrofitKoin: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()

            androidContext(this@RetrofitKoin)

            modules(
                listOf(networkModule, RepositoryModule, viewModelModule)
            )
        }
    }
}