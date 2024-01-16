package com.example.mod7d03

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent

class CounterRepositoryTest {
    val counterRepo = 15
}
@Module
@InstallIn(ViewModelComponent::class)
object TestModule {

    @Provides
    fun provideCounterRepositoryTest(): CounterRepositoryTest {
        return CounterRepositoryTest()
    }
}