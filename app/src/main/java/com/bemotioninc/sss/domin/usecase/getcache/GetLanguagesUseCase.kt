package com.bemotioninc.sss.domin.usecase.getcache

import com.bemotioninc.sss.data.dto.cachingmodules.LanguagesResponse
import com.bemotioninc.sss.domin.repository.AppDataRepository
import com.bemotioninc.sss.utils.ResponseState
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLanguagesUseCase @Inject constructor(private val  appDataRepository: AppDataRepository) {

    fun execute() : Flow<ResponseState<List<LanguagesResponse>>> {
        return  appDataRepository.getLanguages()
    }
}