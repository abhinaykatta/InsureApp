package com.mohammedsapplication.app.modules.iphone11promaxeleven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityIphone11ProMaxElevenBinding
import com.mohammedsapplication.app.modules.iphone11promaxeleven.`data`.model.ListcomponentlottRowModel
import com.mohammedsapplication.app.modules.iphone11promaxeleven.`data`.viewmodel.Iphone11ProMaxElevenVM
import com.mohammedsapplication.app.modules.iphone11promaxtwelve.ui.Iphone11ProMaxTwelveActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone11ProMaxElevenActivity :
    BaseActivity<ActivityIphone11ProMaxElevenBinding>(R.layout.activity_iphone_11_pro_max_eleven) {
  private val viewModel: Iphone11ProMaxElevenVM by viewModels<Iphone11ProMaxElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listcomponentlottAdapter =
    ListcomponentlottAdapter(viewModel.listcomponentlottList.value?:mutableListOf())
    binding.recyclerListcomponentlott.adapter = listcomponentlottAdapter
    listcomponentlottAdapter.setOnItemClickListener(
    object : ListcomponentlottAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcomponentlottRowModel) {
        onClickRecyclerListcomponentlott(view, position, item)
      }
    }
    )
    viewModel.listcomponentlottList.observe(this) {
      listcomponentlottAdapter.updateData(it)
    }
    binding.iphone11ProMaxElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClaimSettled.setOnClickListener {
      val destIntent = Iphone11ProMaxTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListcomponentlott(
    view: View,
    position: Int,
    item: ListcomponentlottRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE11PRO_MAX_ELEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProMaxElevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
