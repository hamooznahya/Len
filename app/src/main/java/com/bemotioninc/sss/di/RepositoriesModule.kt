package com.bemotioninc.sss.di

import com.bemotioninc.sss.data.datasource.OfflineDataSource
import com.bemotioninc.sss.data.datasource.RemoteDataSource
import com.bemotioninc.sss.data.repository.AppDataRepositoryImpl
import com.bemotioninc.sss.data.repository.UserRepositoryImpl
import com.bemotioninc.sss.domin.repository.AppDataRepository
import com.bemotioninc.sss.domin.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoriesModule {

    @Provides
    @Singleton
    fun UserRepository(remoteDataSource: RemoteDataSource): UserRepository {
        return UserRepositoryImpl(remoteDataSource)
    }

    @Provides
    @Singleton
    fun AppDataRepository(remoteDataSource: RemoteDataSource,offlineDataSource: OfflineDataSource): AppDataRepository {
        return AppDataRepositoryImpl(remoteDataSource,offlineDataSource)
    }
}