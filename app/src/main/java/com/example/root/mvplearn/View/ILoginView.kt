package com.example.root.mvplearn.Model.View

interface ILoginView {
    fun onLoginSuccess(message:String)
    fun onLoginError(message:String)
}