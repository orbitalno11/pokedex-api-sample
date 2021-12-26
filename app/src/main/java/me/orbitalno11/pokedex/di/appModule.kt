package me.orbitalno11.pokedex.di

import me.orbitalno11.pokedex.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MainViewModel(get()) }
}