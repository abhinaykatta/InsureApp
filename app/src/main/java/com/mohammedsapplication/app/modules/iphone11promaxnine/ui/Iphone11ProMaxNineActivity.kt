package com.mohammedsapplication.app.modules.iphone11promaxnine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityIphone11ProMaxNineBinding
import com.mohammedsapplication.app.modules.iphone11promaxfive.ui.Iphone11ProMaxFiveActivity
import com.mohammedsapplication.app.modules.iphone11promaxnine.`data`.viewmodel.Iphone11ProMaxNineVM
import com.mohammedsapplication.app.modules.iphone11promaxsix.ui.Iphone11ProMaxSixActivity
import kotlin.String
import kotlin.Unit

class Iphone11ProMaxNineActivity :
    BaseActivity<ActivityIphone11ProMaxNineBinding>(R.layout.activity_iphone_11_pro_max_nine) {
  private val viewModel: Iphone11ProMaxNineVM by viewModels<Iphone11ProMaxNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone11ProMaxNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnFemale.setOnClickListener {
      val destIntent = Iphone11ProMaxFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageFileTwo.setOnClickListener {
      val destIntent = Iphone11ProMaxSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE11PRO_MAX_NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProMaxNineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
