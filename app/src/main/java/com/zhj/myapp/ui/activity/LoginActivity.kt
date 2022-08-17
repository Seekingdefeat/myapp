package com.zhj.myapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.zhj.myapp.R
import com.zhj.myapp.utils.StringUtils
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        var et_username_login = findViewById<EditText>(R.id.et_login_username)
//        var et_pwd_login = findViewById<EditText>(R.id.et_login_pwd)

        // 设置登录按钮监听器
        btn_login_detail.setOnClickListener {
            var userName = findViewById<EditText>(R.id.et_login_username).text.toString().trim()
            var userPwd = findViewById<EditText>(R.id.et_login_pwd).text.toString().trim()
            login(userName, userPwd)
        }
    }

    private fun login(userName: String, userPwd: String) {
        if (StringUtils.isEmpty(userName)) {
            showToast("请输入用户名")
        } else if(StringUtils.isEmpty(userPwd)) {
            showToast("请输入密码")
        } else {
            showToast("登陆成功")
        }
    }

}