package com.mohammedsapplication.app.modules.iphone11promaxfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityIphone11ProMaxFiveBinding
import com.mohammedsapplication.app.modules.iphone11promaxeight.ui.Iphone11ProMaxEightActivity
import com.mohammedsapplication.app.modules.iphone11promaxfive.`data`.viewmodel.Iphone11ProMaxFiveVM
import com.mohammedsapplication.app.modules.iphone11promaxfour.ui.Iphone11ProMaxFourActivity
import com.mohammedsapplication.app.modules.iphone11promaxnine.ui.Iphone11ProMaxNineActivity
import com.mohammedsapplication.app.modules.iphone11promaxseven.ui.Iphone11ProMaxSevenActivity
import com.mohammedsapplication.app.modules.iphone11promaxsix.ui.Iphone11ProMaxSixActivity
import kotlin.String
import kotlin.Unit

class Iphone11ProMaxFiveActivity :
    BaseActivity<ActivityIphone11ProMaxFiveBinding>(R.layout.activity_iphone_11_pro_max_five) {
  private val viewModel: Iphone11ProMaxFiveVM by viewModels<Iphone11ProMaxFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone11ProMaxFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFileThree.setOnClickListener {
      val destIntent = Iphone11ProMaxNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFile.setOnClickListener {
      val destIntent = Iphone11ProMaxSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = Iphone11ProMaxEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFileOne.setOnClickListener {
      val destIntent = Iphone11ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMale.setOnClickListener {
      val destIntent = Iphone11ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFileTwo.setOnClickListener {
      val destIntent = Iphone11ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE11PRO_MAX_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProMaxFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
