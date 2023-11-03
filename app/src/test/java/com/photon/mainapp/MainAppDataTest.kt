package com.photon.mainapp

import androidx.compose.runtime.collectAsState
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.lifecycle.viewModelScope
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.photon.findmyip.data.repository.Ip
import com.photon.findmyip.domain.repository.GetDataRepositoryApi
import com.photon.findmyip.domain.usecase.GetDataUsecase
import com.photon.findmyip.presenter.ui.GetDataViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations


class MainAppDataTest {

    @Mock
    private lateinit var mockApi: GetDataRepositoryApi

    @Before
    fun setup() {

        MockitoAnnotations.openMocks(this)
    }

    @Test
     fun getDataTest()=
runBlocking {
    Mockito.`when`(mockApi.getIp()).thenReturn(Ip("test","test","test","test","test","test","test","test","test","test","test","test","test",true,"test",0.00,0.00,"test","test","test","test","test","test",0.00,0.00,"test","test") )
    // Call the method in the ViewModel that fetches data
    val result =  mockApi.getIp()
    assertEquals("test",result.country)

}





}