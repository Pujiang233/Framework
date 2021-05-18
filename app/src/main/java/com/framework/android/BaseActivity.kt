package com.framework.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.framework.android.util.LogUtil

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtil.d(javaClass.simpleName, "onCreate")
        ActivityCollector.addActivity(this)
    }
    

    //android.os.Process.killProcess(android.os.Process.myPid())
    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }


    override fun onStart() {
        super.onStart()
        LogUtil.d(javaClass.simpleName, "onStart")
    }
    override fun onResume() {
        super.onResume()
        LogUtil.d(javaClass.simpleName, "onResume")
    }
    override fun onPause() {
        super.onPause()
        LogUtil.d(javaClass.simpleName, "onPause")
    }
    override fun onStop() {
        super.onStop()
        LogUtil.d(javaClass.simpleName, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        LogUtil.d(javaClass.simpleName, "onRestart")
    }
}