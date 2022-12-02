package com.mohammedsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityAppNavigationBinding
import com.mohammedsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.mohammedsapplication.app.modules.iphone11promaxeight.ui.Iphone11ProMaxEightActivity
import com.mohammedsapplication.app.modules.iphone11promaxeleven.ui.Iphone11ProMaxElevenActivity
import com.mohammedsapplication.app.modules.iphone11promaxfive.ui.Iphone11ProMaxFiveActivity
import com.mohammedsapplication.app.modules.iphone11promaxfour.ui.Iphone11ProMaxFourActivity
import com.mohammedsapplication.app.modules.iphone11promaxnine.ui.Iphone11ProMaxNineActivity
import com.mohammedsapplication.app.modules.iphone11promaxseven.ui.Iphone11ProMaxSevenActivity
import com.mohammedsapplication.app.modules.iphone11promaxsix.ui.Iphone11ProMaxSixActivity
import com.mohammedsapplication.app.modules.iphone11promaxten.ui.Iphone11ProMaxTenActivity
import com.mohammedsapplication.app.modules.iphone11promaxthree.ui.Iphone11ProMaxThreeActivity
import com.mohammedsapplication.app.modules.iphone11promaxtwelve.ui.Iphone11ProMaxTwelveActivity
import com.mohammedsapplication.app.modules.iphone11promaxtwo.ui.Iphone11ProMaxTwoActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearIPhone11ProMaxNine.setOnClickListener {
      val destIntent = Iphone11ProMaxNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxTen.setOnClickListener {
      val destIntent = Iphone11ProMaxTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxTwo.setOnClickListener {
      val destIntent = Iphone11ProMaxTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxEleven.setOnClickListener {
      val destIntent = Iphone11ProMaxElevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxThree.setOnClickListener {
      val destIntent = Iphone11ProMaxThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxSix.setOnClickListener {
      val destIntent = Iphone11ProMaxSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxSeven.setOnClickListener {
      val destIntent = Iphone11ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxTwelve.setOnClickListener {
      val destIntent = Iphone11ProMaxTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxFive.setOnClickListener {
      val destIntent = Iphone11ProMaxFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxEight.setOnClickListener {
      val destIntent = Iphone11ProMaxEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone11ProMaxFour.setOnClickListener {
      val destIntent = Iphone11ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
