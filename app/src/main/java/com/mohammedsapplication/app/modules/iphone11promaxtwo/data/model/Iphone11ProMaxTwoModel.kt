package com.mohammedsapplication.app.modules.iphone11promaxtwo.`data`.model

import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone11ProMaxTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRequestaride: String? =
      MyApp.getInstance().resources.getString(R.string.msg_best_health_ins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpyoufindt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_best_health_ins3)

)
