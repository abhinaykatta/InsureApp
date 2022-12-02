package com.mohammedsapplication.app.modules.iphone11promaxeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxeight.`data`.model.Iphone11ProMaxEightModel
import org.koin.core.KoinComponent

class Iphone11ProMaxEightVM : ViewModel(), KoinComponent {
  val iphone11ProMaxEightModel: MutableLiveData<Iphone11ProMaxEightModel> =
      MutableLiveData(Iphone11ProMaxEightModel())

  var navArguments: Bundle? = null
}
