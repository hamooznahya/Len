package com.bemotioninc.sss.data.repository

import com.bemotioninc.sss.data.datasource.OfflineDataSource
import com.bemotioninc.sss.data.datasource.RemoteDataSource
import com.bemotioninc.sss.data.dto.cachingmodules.CachingResponse
import com.bemotioninc.sss.data.dto.cachingmodules.LanguagesResponse
import com.bemotioninc.sss.domin.mappers.CacheMappers
import com.bemotioninc.sss.domin.repository.AppDataRepository
import com.bemotioninc.sss.utils.ResponseState
import com.bemotioninc.sss.utils.mapToError
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class AppDataRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val offlineDataSource: OfflineDataSource,
    private val cacheMapper: CacheMappers
) :AppDataRepository {

    override fun getCaching(
        platformId: String,
        languageId: String
    ): Flow<ResponseState<CachingResponse>> {
        return flow<ResponseState<CachingResponse>> {
            emit(ResponseState.Loading)
            remoteDataSource.getCaching(platformId, languageId).onSuccess {
                val appCaching = offlineDataSource.getAppCaching().first()
                appCaching.primaryColor = it.data!!.officer.primaryColor
                offlineDataSource.saveAppCaching(appCaching)
                //emit(ResponseState.Success(cacheMapper.map(it.data!!)))
                emit(ResponseState.Success(it.data!!))
            }.onFailure {
                emit(ResponseState.Failure(it.mapToError()))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getLanguages(): Flow<ResponseState<List<LanguagesResponse>>> {
        return flow<ResponseState<List<LanguagesResponse>>> {
            emit(ResponseState.Loading)
            remoteDataSource.getLanguages().onSuccess {
                emit(ResponseState.Success(it.data!!))
            }.onFailure {
                emit(ResponseState.Failure(it.mapToError()))
            }
        }.flowOn(Dispatchers.IO)
    }

}