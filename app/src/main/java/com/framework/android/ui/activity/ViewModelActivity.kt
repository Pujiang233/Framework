package com.framework.android.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.framework.android.R
import com.framework.android.databinding.ActivityViewModelBinding
import com.framework.android.ui.base.BaseActivity
import com.framework.android.bean.User
import com.framework.android.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_view_model.*

class ViewModelActivity : BaseActivity() {

    private lateinit var userViewModel: UserViewModel
    private lateinit var binding: ActivityViewModelBinding


    companion object {
        fun actionStart(context: Context) {
            val intent = Intent(context, ViewModelActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initViewData() {
        binding = DataBindingUtil.setContentView<ActivityViewModelBinding>(this, R.layout.activity_view_model)
        binding.lifecycleOwner = this
        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        binding.viewModel = userViewModel
        // 让xml内绑定的LiveData和Observer建立连接，也正是因为这段代码，让LiveData能感知Activity的生命周期

        userViewModel.user.value = User("asdf",1,2)

    }

    override fun initListener() {
        bt_vm.setOnClickListener {
            userViewModel.user.value = User("assadfdf",1,2)

        }
    }
}