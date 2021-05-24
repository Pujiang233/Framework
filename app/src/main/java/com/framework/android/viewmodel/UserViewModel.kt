package com.framework.android.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.framework.android.bean.User

// 新建ViewModel类
// 新建ViewModel类
class UserViewModel : ViewModel() {
    var user = MutableLiveData<User>()
}