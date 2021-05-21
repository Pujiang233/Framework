package com.framework.android.util

import android.content.Context
import android.widget.Toast
import com.framework.android.ui.base.MyApplication


/**
 * 两种方式创建方式
 * 1.ToastUtil.showToast("Adsf)
 * 2."adsf".showToast
 */

object ToastUtil {

    fun showToast(str: String, duration: Int = Toast.LENGTH_SHORT){
        str.showToast(duration)
    }

}

fun String.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(MyApplication.context, this, duration).show()
}
fun Int.showToast(duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(MyApplication.context, this, duration).show()
}