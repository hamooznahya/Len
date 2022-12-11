package com.bemotioninc.sss.presentation.splashscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bemotioninc.sss.data.dto.cachingmodules.CachingResponse
import com.bemotioninc.sss.data.dto.cachingmodules.LanguagesResponse
import com.bemotioninc.sss.domin.usecase.getcache.GetCacheUseCase
import com.bemotioninc.sss.domin.usecase.getcache.GetLanguagesUseCase
import com.bemotioninc.sss.utils.ResponseState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.net.CacheResponse
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val getCacheUseCase: GetCacheUseCase,
    private val getLanguagesUseCase: GetLanguagesUseCase
) :
    ViewModel() {

    //MutableStateFlow (Save last action state) TODO Good for using with lists 
    //TODO in case change screen state from portrait to landscape this func will keep the list without refreshing  
    private val _getCache = MutableStateFlow<ResponseState<CachingResponse>?>(null)
    val getCache = _getCache.asStateFlow()

    private val _getLanguages = MutableStateFlow<ResponseState<List<LanguagesResponse>>?>(null)
    val getLanguages = _getLanguages.asStateFlow()

    //MutableSharedFlow  (Didn't save last action state)
    //TODO in case change screen state from portrait to landscape this func will keep teh list will refresh again
    private val _getCache1 = MutableSharedFlow<CacheResponse>()

    fun getCache(platformId: String, languageId: String) {
        viewModelScope.launch {//TODO THIS Thread is from coratines  >>i used it because the collect need coratine thread
            getCacheUseCase.execute(platformId, languageId).collectLatest {
                _getCache.emit(it)
            }
        }
    }

    fun getLanguages() {
        viewModelScope.launch {//TODO THIS Thread is from coratines  >>i used it because the collect need coratine thread
            getLanguagesUseCase.execute().collectLatest {
                _getLanguages.emit(it)
            }
        }
    }

}