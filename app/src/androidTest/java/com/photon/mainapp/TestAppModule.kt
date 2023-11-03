package com.photon.mainapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.photon.findmyip.data.repository.GetDataRetrofitApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Named

@RunWith(AndroidJUnit4::class)
class RetrofitInstrumentedTest {

    @Inject
    lateinit var apiService: GetDataRetrofitApi

    @Test
    fun testRetrofitCall() {
        // Set up Hilt
        // You might need to set up Hilt in the test's Application class

        // Set up Retrofit
        val retrofit = Retrofit.Builder()
            .baseUrl("https://ipapi.co/") // Replace with your base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiService = retrofit.create(GetDataRetrofitApi::class.java)

        // Make your Retrofit call and assert the response
        // For example:
        runBlocking {

            val response = apiService.getIp()
            assertEquals("IN", response.country)

        }
    }
}




