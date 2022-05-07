package com.tecsup.practica2.Vistas


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tecsup.practica2.R
import com.tecsup.practica2.Vistas.Marco.MarcoFragment

class HomeActivity: AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val actionBar = supportActionBar
        actionBar?.hide()

        openFragment(MarcoFragment.newInstance())

    }
    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayoutContent, fragment)
        transaction.commit()
    }
}