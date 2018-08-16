package com.example.diegojosuepachecorosas.demodagger

class Boltons : House{
    override fun prepareForWar() {
        System.out.println(this.javaClass.simpleName + " prepared for war")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.simpleName + " reporting...")
    }
}