package com.bemotioninc.sss.domin.repository

import com.bemotioninc.sss.data.dto.cachingmodules.CachingResponse
import com.bemotioninc.sss.data.dto.cachingmodules.LanguagesResponse
import com.bemotioninc.sss.utils.ResponseState
import kotlinx.coroutines.flow.Flow

interface AppDataRepository {

    fun getCaching(platformId: String, languageId: String): Flow<ResponseState<CachingResponse>>

    fun getLanguages(): Flow<ResponseState<List<LanguagesResponse>>>

}