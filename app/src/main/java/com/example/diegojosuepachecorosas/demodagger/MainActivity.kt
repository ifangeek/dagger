package com.example.diegojosuepachecorosas.demodagger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stark  = Starks()
        var bolton = Boltons()

        var war = War(stark,bolton)

        war.prepare()
        war.report()



    }
}
