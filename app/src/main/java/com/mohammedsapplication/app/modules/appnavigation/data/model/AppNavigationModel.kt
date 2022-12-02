package com.mohammedsapplication.app.modules.appnavigation.`data`.model

import com.mohammedsapplication.app.R
import com.mohammedsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxTen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxEleven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxTwelve: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxNine: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone11ProMaxEight: String? =
      MyApp.getInstance().resources.getString(R.string.msg_iphone_11_pro_m11)

)
