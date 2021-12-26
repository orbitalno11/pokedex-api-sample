package me.orbitalno11.pokedex

import android.app.Application
import me.orbitalno11.pokedex.core.di.coreModule
import me.orbitalno11.pokedex.data.dataModule
import me.orbitalno11.pokedex.di.appModule
import me.orbitalno11.pokedex.domain.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PokedexApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@PokedexApplication)
            modules(
                listOf(
                    appModule,
                    coreModule,
                    domainModule,
                    dataModule
                )
            )
        }
    }
}