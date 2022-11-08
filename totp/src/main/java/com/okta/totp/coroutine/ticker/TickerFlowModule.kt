package com.okta.totp.coroutine.ticker

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
interface TickerFlowModule {
    @Singleton
    @Binds
    fun bindTickerFlowFactory(
        tickerFlowFactoryImpl: TickerFlowFactoryImpl
    ): TickerFlowFactory
}
