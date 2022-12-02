package com.mohammedsapplication.app.modules.iphone11promaxfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityIphone11ProMaxFourBinding
import com.mohammedsapplication.app.modules.iphone11promaxeight.ui.Iphone11ProMaxEightActivity
import com.mohammedsapplication.app.modules.iphone11promaxeleven.ui.Iphone11ProMaxElevenActivity
import com.mohammedsapplication.app.modules.iphone11promaxfive.ui.Iphone11ProMaxFiveActivity
import com.mohammedsapplication.app.modules.iphone11promaxfour.`data`.viewmodel.Iphone11ProMaxFourVM
import com.mohammedsapplication.app.modules.iphone11promaxnine.ui.Iphone11ProMaxNineActivity
import com.mohammedsapplication.app.modules.iphone11promaxseven.ui.Iphone11ProMaxSevenActivity
import com.mohammedsapplication.app.modules.iphone11promaxsix.ui.Iphone11ProMaxSixActivity
import com.mohammedsapplication.app.modules.iphone11promaxten.ui.Iphone11ProMaxTenActivity
import kotlin.String
import kotlin.Unit

class Iphone11ProMaxFourActivity :
    BaseActivity<ActivityIphone11ProMaxFourBinding>(R.layout.activity_iphone_11_pro_max_four) {
  private val viewModel: Iphone11ProMaxFourVM by viewModels<Iphone11ProMaxFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone11ProMaxFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFileThree.setOnClickListener {
      val destIntent = Iphone11ProMaxSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewEllipseFour.setOnClickListener {
      val destIntent = Iphone11ProMaxTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFemale.setOnClickListener {
      val destIntent = Iphone11ProMaxFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageFileTwo.setOnClickListener {
      val destIntent = Iphone11ProMaxNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageVector.setOnClickListener {
      val destIntent = Iphone11ProMaxElevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = Iphone11ProMaxEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFile.setOnClickListener {
      val destIntent = Iphone11ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageFileOne.setOnClickListener {
      val destIntent = Iphone11ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE11PRO_MAX_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProMaxFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
