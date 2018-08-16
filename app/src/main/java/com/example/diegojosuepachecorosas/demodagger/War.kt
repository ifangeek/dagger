package com.example.diegojosuepachecorosas.demodagger

class War(starks: Starks,boltons: Boltons) {

    lateinit var starks : Starks
    lateinit var boltons : Boltons

    // 1 forma de injeccion de dependencia ( DI )

    fun prepare(){
        starks.prepareForWar()
        boltons.prepareForWar()
    }
    fun report(){
        starks.reportForWar()
        boltons.reportForWar()
    }


}