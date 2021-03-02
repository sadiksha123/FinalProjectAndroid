package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignupActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var etfName: EditText
    private lateinit var etlName: EditText
    private lateinit var etemail: EditText
    private lateinit var etPassword: EditText
    private lateinit var tvGoToLogin: TextView
    private lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        etfName = findViewById(R.id.etFName)
        etlName = findViewById(R.id.etLName)
        etemail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        tvGoToLogin = findViewById(R.id.tvGoToLogin)
        btnRegister = findViewById(R.id.btnRegister)

        tvGoToLogin.setOnClickListener(this)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        val intent = Intent(this, LoginActivity::class.java)
        when (v?.id) {
            R.id.tvGoToLogin -> {
                startActivity(Intent(intent))
            }
        }
    }
}