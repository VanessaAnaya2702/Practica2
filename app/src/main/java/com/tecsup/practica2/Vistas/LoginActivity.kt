package com.tecsup.practica2.Vistas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tecsup.practica2.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionBar = supportActionBar
        actionBar?.hide()

        btnInicio.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }

}