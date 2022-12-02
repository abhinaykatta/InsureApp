package com.mohammedsapplication.app.modules.iphone11promaxsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxsix.`data`.model.Iphone11ProMaxSixModel
import org.koin.core.KoinComponent

class Iphone11ProMaxSixVM : ViewModel(), KoinComponent {
  val iphone11ProMaxSixModel: MutableLiveData<Iphone11ProMaxSixModel> =
      MutableLiveData(Iphone11ProMaxSixModel())

  var navArguments: Bundle? = null
}
