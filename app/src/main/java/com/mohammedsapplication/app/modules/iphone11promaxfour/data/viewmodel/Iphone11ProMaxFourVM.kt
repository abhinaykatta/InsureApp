package com.mohammedsapplication.app.modules.iphone11promaxfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxfour.`data`.model.Iphone11ProMaxFourModel
import org.koin.core.KoinComponent

class Iphone11ProMaxFourVM : ViewModel(), KoinComponent {
  val iphone11ProMaxFourModel: MutableLiveData<Iphone11ProMaxFourModel> =
      MutableLiveData(Iphone11ProMaxFourModel())

  var navArguments: Bundle? = null
}
