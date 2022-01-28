package com.gabinetedoamom.buracometro.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel(), CoroutineScope {

    val loading = MutableLiveData<Boolean>()

    override val coroutineContext: CoroutineContext
        get() =  viewModelScope.coroutineContext + Dispatchers.IO
}