package com.mohammedsapplication.app.modules.iphone11promaxsix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityIphone11ProMaxSixBinding
import com.mohammedsapplication.app.modules.iphone11promaxeight.ui.Iphone11ProMaxEightActivity
import com.mohammedsapplication.app.modules.iphone11promaxfive.ui.Iphone11ProMaxFiveActivity
import com.mohammedsapplication.app.modules.iphone11promaxsix.`data`.viewmodel.Iphone11ProMaxSixVM
import kotlin.String
import kotlin.Unit

class Iphone11ProMaxSixActivity :
    BaseActivity<ActivityIphone11ProMaxSixBinding>(R.layout.activity_iphone_11_pro_max_six) {
  private val viewModel: Iphone11ProMaxSixVM by viewModels<Iphone11ProMaxSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone11ProMaxSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageMenu.setOnClickListener {
      val destIntent = Iphone11ProMaxEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFemale.setOnClickListener {
      val destIntent = Iphone11ProMaxFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE11PRO_MAX_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProMaxSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
