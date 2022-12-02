package com.mohammedsapplication.app.modules.iphone11promaxtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxtwo.`data`.model.Iphone11ProMaxTwoModel
import org.koin.core.KoinComponent

class Iphone11ProMaxTwoVM : ViewModel(), KoinComponent {
  val iphone11ProMaxTwoModel: MutableLiveData<Iphone11ProMaxTwoModel> =
      MutableLiveData(Iphone11ProMaxTwoModel())

  var navArguments: Bundle? = null
}
