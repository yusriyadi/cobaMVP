package com.example.root.mvplearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.root.mvplearn.Model.View.ILoginView
import com.example.root.mvplearn.Presenter.LoginPresenter
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ILoginView {
    override fun onLoginSuccess(message: String) {
        Toasty.success(this, message,Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this, message,Toast.LENGTH_SHORT).show()
    }


    internal lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //inisial
        loginPresenter = LoginPresenter(this)

        //evnt
        btn_login.setOnClickListener {
            loginPresenter.onLogin(edt_email.text.toString(),edt_password.text.toString())

        }


    }
}
