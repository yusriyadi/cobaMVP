package com.example.root.mvplearn.Presenter

import com.example.root.mvplearn.Model.User
import com.example.root.mvplearn.Model.View.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView):ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email,password)
        val loginCode =  user.isDataValid ()

        if (loginCode ==0 )
            iLoginView.onLoginError("Email harus di isi !")
        else if (loginCode ==1 )
            iLoginView.onLoginError("Alamat email salah !")
        else if (loginCode == 2)
            iLoginView.onLoginError("Password minimal 6 karakter !")
        else
            iLoginView.onLoginSuccess("Login Berhasil")
    }
}