package com.mohammedsapplication.app.modules.iphone11promaxtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityIphone11ProMaxTwoBinding
import com.mohammedsapplication.app.modules.iphone11promaxthree.ui.Iphone11ProMaxThreeActivity
import com.mohammedsapplication.app.modules.iphone11promaxtwo.`data`.viewmodel.Iphone11ProMaxTwoVM
import kotlin.String
import kotlin.Unit

class Iphone11ProMaxTwoActivity :
    BaseActivity<ActivityIphone11ProMaxTwoBinding>(R.layout.activity_iphone_11_pro_max_two) {
  private val viewModel: Iphone11ProMaxTwoVM by viewModels<Iphone11ProMaxTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone11ProMaxTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearIPhone11ProM.setOnClickListener {
      val destIntent = Iphone11ProMaxThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE11PRO_MAX_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProMaxTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
