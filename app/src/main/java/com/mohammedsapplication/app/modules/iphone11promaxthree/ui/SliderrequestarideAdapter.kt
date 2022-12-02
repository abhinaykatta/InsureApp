package com.mohammedsapplication.app.modules.iphone11promaxthree.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.mohammedsapplication.app.databinding.SlideritemIphone11ProMaxThree1Binding
import com.mohammedsapplication.app.modules.iphone11promaxthree.`data`.model.ImageSliderSliderrequestarideModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderrequestarideAdapter(
  val dataList: ArrayList<ImageSliderSliderrequestarideModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderrequestarideModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemIphone11ProMaxThree1Binding) {
      binding.imageSliderSliderrequestarideModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemIphone11ProMaxThree1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
