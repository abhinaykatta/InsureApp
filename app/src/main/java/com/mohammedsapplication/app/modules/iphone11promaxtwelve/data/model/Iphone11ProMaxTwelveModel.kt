package com.mohammedsapplication.app.modules.iphone11promaxtwelve.`data`.model

import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone11ProMaxTwelveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt9PlansFound: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_plans_found)

)
