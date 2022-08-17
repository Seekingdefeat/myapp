package com.zhj.myapp.ui.activity

import android.os.Bundle
import android.widget.EditText
import com.zhj.myapp.R
import com.zhj.myapp.utils.StringUtils
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var et_userName_register = findViewById<EditText>(R.id.et_register_username)
        var et_userPwd_register = findViewById<EditText>(R.id.et_register_pwd)

        // 注册按钮监听器
        btn_register_detail.setOnClickListener {
            var userName = et_userName_register.text.toString().trim()
            var userPwd = et_userPwd_register.text.toString().trim()
            login(userName, userPwd)
        }
    }

    // 登陆逻辑
    private fun login(userName: String, userPwd: String) {
        if (StringUtils.isEmpty(userName)) {
            showToast("请输入用户名")
        } else if (StringUtils.isEmpty(userPwd)) {
            showToast("请输入密码")
        } else {
            showToast("注册成功")
        }
    }

}