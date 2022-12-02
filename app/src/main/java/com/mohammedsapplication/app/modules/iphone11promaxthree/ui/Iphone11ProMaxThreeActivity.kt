package com.mohammedsapplication.app.modules.iphone11promaxthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.base.BaseActivity
import com.mohammedsapplication.app.databinding.ActivityIphone11ProMaxThreeBinding
import com.mohammedsapplication.app.modules.iphone11promaxfour.ui.Iphone11ProMaxFourActivity
import com.mohammedsapplication.app.modules.iphone11promaxthree.`data`.model.ImageSliderSliderrequestarideModel
import com.mohammedsapplication.app.modules.iphone11promaxthree.`data`.viewmodel.Iphone11ProMaxThreeVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class Iphone11ProMaxThreeActivity :
    BaseActivity<ActivityIphone11ProMaxThreeBinding>(R.layout.activity_iphone_11_pro_max_three) {
  private val imageSliderSliderrequestarideItems: ArrayList<ImageSliderSliderrequestarideModel> =
      arrayListOf()


  private val viewModel: Iphone11ProMaxThreeVM by viewModels<Iphone11ProMaxThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderrequestarideAdapter =
    SliderrequestarideAdapter(imageSliderSliderrequestarideItems,true)
    binding.imageSliderSliderrequestaride.adapter = sliderrequestarideAdapter
    binding.iphone11ProMaxThreeVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderrequestaride.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderrequestaride.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.linearIPhone11ProM.setOnClickListener {
      val destIntent = Iphone11ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE11PRO_MAX_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProMaxThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
