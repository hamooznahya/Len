package com.bemotioninc.sss.domin.usecase.getcache

import com.bemotioninc.sss.data.dto.cachingmodules.CachingResponse
import com.bemotioninc.sss.domin.repository.AppDataRepository
import com.bemotioninc.sss.utils.ResponseState
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCacheUseCase @Inject constructor(
    private val appDataRepository: AppDataRepository
){
    fun execute(platformId: String, languageId: String) : Flow<ResponseState<CachingResponse>>{
        return  appDataRepository.getCaching(platformId,languageId)
    }
}