package com.mohammedsapplication.app.modules.iphone11promaxfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxfive.`data`.model.Iphone11ProMaxFiveModel
import org.koin.core.KoinComponent

class Iphone11ProMaxFiveVM : ViewModel(), KoinComponent {
  val iphone11ProMaxFiveModel: MutableLiveData<Iphone11ProMaxFiveModel> =
      MutableLiveData(Iphone11ProMaxFiveModel())

  var navArguments: Bundle? = null
}
