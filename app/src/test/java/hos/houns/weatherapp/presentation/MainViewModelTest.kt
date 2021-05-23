package hos.houns.weatherapp.presentation

import hos.houns.weatherapp.domain.usecases.GetWeatherUseCase
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class MainViewModelTest{
    private lateinit var viewModel: MainViewModel
    private lateinit var getWeatherUseCase: GetWeatherUseCase

    @BeforeAll
    fun beforeAll() {
        getWeatherUseCase = mockk()
      // viewModel = MainViewModel(getWeatherUseCase)
    }

    @Test
    fun test(){

    }
}