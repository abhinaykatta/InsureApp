package com.mohammedsapplication.app.modules.iphone11promaxthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxthree.`data`.model.Iphone11ProMaxThreeModel
import org.koin.core.KoinComponent

class Iphone11ProMaxThreeVM : ViewModel(), KoinComponent {
  val iphone11ProMaxThreeModel: MutableLiveData<Iphone11ProMaxThreeModel> =
      MutableLiveData(Iphone11ProMaxThreeModel())

  var navArguments: Bundle? = null
}
