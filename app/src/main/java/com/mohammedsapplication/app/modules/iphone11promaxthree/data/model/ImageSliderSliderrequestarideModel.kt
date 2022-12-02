package com.mohammedsapplication.app.modules.iphone11promaxthree.`data`.model

import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderrequestarideModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRequestaride: String? =
      MyApp.getInstance().resources.getString(R.string.msg_most_reliable_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpyoufindt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_most_reliable_t)

)
