package com.example.root.mvplearn.Model

interface IUser {

    val email:String
    val password : String

    fun isDataValid() : Int


}