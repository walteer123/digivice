package com.walter.digivice.digimons.di

import com.walter.digivice.digimons.data.repository.DigimonRepositoryImpl
import com.walter.digivice.digimons.data.service.DigimonService
import com.walter.digivice.digimons.domain.DigimonRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindsDigimonRepository(
        repositoryImpl: DigimonRepositoryImpl
    ): DigimonRepository

}

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Provides
    fun provideDigimonService(
        httpClient: HttpClient
    ) = DigimonService(httpClient)

}
