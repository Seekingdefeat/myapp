package com.zhj.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhj.myapp.ui.activity.BaseActivity
import com.zhj.myapp.ui.activity.LoginActivity
import com.zhj.myapp.ui.activity.RegisterActivity
import kotlinx.android.synthetic.main.login_layout.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        btn_login_basic.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btn_register_basic.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}