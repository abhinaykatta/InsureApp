package com.mohammedsapplication.app.modules.iphone11promaxnine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxnine.`data`.model.Iphone11ProMaxNineModel
import org.koin.core.KoinComponent

class Iphone11ProMaxNineVM : ViewModel(), KoinComponent {
  val iphone11ProMaxNineModel: MutableLiveData<Iphone11ProMaxNineModel> =
      MutableLiveData(Iphone11ProMaxNineModel())

  var navArguments: Bundle? = null
}
