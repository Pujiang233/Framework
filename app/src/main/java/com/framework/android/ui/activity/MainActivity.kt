package com.framework.android.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.framework.android.ui.base.BaseActivity
import com.framework.android.R
import com.framework.android.util.ToastUtil
import com.framework.android.util.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    /**
     * 启动方式
     */
    companion object {
        fun actionStart(context: Context) {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ViewModelActivity.actionStart(this)
    }

    override fun initViewData() {

    }

    override fun initListener() {

    }




}