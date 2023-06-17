package com.main.blockify.main.presentation.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.main.blockify.core.domain.DispatchersList
import com.main.blockify.core.domain.Init
import com.main.blockify.datasource.datastore.DataStoreRepository
import com.main.blockify.main.domain.navigation.root.RootNavigationGraphRoutes
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val dataStoreRepository: DataStoreRepository,
    private val dispatchers: DispatchersList,
) : ViewModel(), Init {

    private val _startDestination: MutableState<String> = mutableStateOf(RootNavigationGraphRoutes.SPLASH)
    val startDestination: State<String> = _startDestination

    init { init() }

    override fun init() {
        viewModelScope.launch(dispatchers.io()) {
            dataStoreRepository.readOnBoardingState().collect { completed ->
                withContext(dispatchers.ui()) {
                    if (completed) {
                        _startDestination.value = RootNavigationGraphRoutes.MAIN
                    } else {
                        _startDestination.value = RootNavigationGraphRoutes.ON_BOARDING
                    }
                }
            }
        }
    }
}
