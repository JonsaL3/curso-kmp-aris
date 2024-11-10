package com.gonzaloracerogalan.cursokmparis.di

import com.gonzaloracerogalan.cursokmparis.domain.Ejemplo1
import com.gonzaloracerogalan.cursokmparis.domain.Ejemplo2
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val domainModule = module {
    factory<Ejemplo2> { Ejemplo2() }
//    single<Ejemplo1> { Ejemplo1(get()) }
    singleOf(::Ejemplo1)
}