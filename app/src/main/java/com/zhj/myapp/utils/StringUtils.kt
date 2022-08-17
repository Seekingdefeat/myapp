package com.zhj.myapp.utils

/**
 * Description:
 */
object StringUtils {
    fun isEmpty(str: String) :Boolean {
        if (str == null || str.length <= 0) return true
        else return false
    }
}