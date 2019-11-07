package sample.swivelgroup.newsreader.auth

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import sample.R

import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.toolbar
import kotlinx.android.synthetic.main.activity_registration.*
import kotlinx.android.synthetic.main.content_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)

        tvSignIn.setOnClickListener {
            val myIntent =  Intent(getBaseContext(),RegistrationActivity::class.java);
            startActivity(myIntent);
        }
    }

}
