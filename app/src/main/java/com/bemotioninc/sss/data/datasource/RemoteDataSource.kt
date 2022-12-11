package com.bemotioninc.sss.data.datasource

import com.bemotioninc.sss.data.dto.BaseResponse
import com.bemotioninc.sss.data.dto.cachingmodules.CachingResponse
import com.bemotioninc.sss.data.dto.cachingmodules.LanguagesResponse

interface RemoteDataSource {
                                                                  // : Mean return
                                                                  // Result is from coratine
    suspend fun getCaching(platformId: String, languageId: String) : Result<BaseResponse<CachingResponse>>

    suspend fun getLanguages():Result<BaseResponse<List<LanguagesResponse>>>
}