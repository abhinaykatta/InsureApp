package com.mohammedsapplication.app.modules.iphone11promaxtwelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityIphone11ProMaxTwelveBinding
import com.mohammedsapplication.app.modules.iphone11promaxeleven.ui.Iphone11ProMaxElevenActivity
import com.mohammedsapplication.app.modules.iphone11promaxtwelve.`data`.model.Listcomponentlott1RowModel
import com.mohammedsapplication.app.modules.iphone11promaxtwelve.`data`.viewmodel.Iphone11ProMaxTwelveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone11ProMaxTwelveActivity :
    BaseActivity<ActivityIphone11ProMaxTwelveBinding>(R.layout.activity_iphone_11_pro_max_twelve) {
  private val viewModel: Iphone11ProMaxTwelveVM by viewModels<Iphone11ProMaxTwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listcomponentlottAdapter =
    ListcomponentlottAdapter(viewModel.listcomponentlottList.value?:mutableListOf())
    binding.recyclerListcomponentlott.adapter = listcomponentlottAdapter
    listcomponentlottAdapter.setOnItemClickListener(
    object : ListcomponentlottAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listcomponentlott1RowModel) {
        onClickRecyclerListcomponentlott(view, position, item)
      }
    }
    )
    viewModel.listcomponentlottList.observe(this) {
      listcomponentlottAdapter.updateData(it)
    }
    binding.iphone11ProMaxTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnRelevance.setOnClickListener {
      val destIntent = Iphone11ProMaxElevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListcomponentlott(
    view: View,
    position: Int,
    item: Listcomponentlott1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE11PRO_MAX_TWELVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProMaxTwelveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
