package com.zhj.myapp.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * Description:
 */
open class BaseActivity : AppCompatActivity() {
    // 获取本activity，理解有待加深
    lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
    }

    // 点击后的提示，只需传入信息即可
    fun showToast(msg : String) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
    }

    // Intent进行页面跳转现在可能泛型出了问题，只能重复调用
//    fun <T> navigateTo(cls: Class<T>) {
//        var intent = Intent(mContext, cls::class.java)
//        startActivity(intent)
//    }

}