package com.mohammedsapplication.app.modules.iphone11promaxten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxten.`data`.model.Iphone11ProMaxTenModel
import org.koin.core.KoinComponent

class Iphone11ProMaxTenVM : ViewModel(), KoinComponent {
  val iphone11ProMaxTenModel: MutableLiveData<Iphone11ProMaxTenModel> =
      MutableLiveData(Iphone11ProMaxTenModel())

  var navArguments: Bundle? = null
}
