package com.bemotioninc.sss.domin.datasource

import com.bemotioninc.sss.data.ApiEndPoint
import com.bemotioninc.sss.data.datasource.RemoteDataSource
import com.bemotioninc.sss.data.dto.BaseResponse
import com.bemotioninc.sss.data.dto.cachingmodules.CachingResponse
import com.bemotioninc.sss.data.dto.cachingmodules.LanguagesResponse
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiEndpoints: ApiEndPoint) : RemoteDataSource {

    override suspend fun getCaching(platformId: String, languageId: String): Result<BaseResponse<CachingResponse>> {
        return  runCatching {
            apiEndpoints.getCaching()
        }
    }

    override suspend fun getLanguages(): Result<BaseResponse<List<LanguagesResponse>>> {
        return  runCatching {
            apiEndpoints.getLanguages()
        }
    }


}