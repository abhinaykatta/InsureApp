package com.mohammedsapplication.app.modules.iphone11promaxseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxseven.`data`.model.Iphone11ProMaxSevenModel
import org.koin.core.KoinComponent

class Iphone11ProMaxSevenVM : ViewModel(), KoinComponent {
  val iphone11ProMaxSevenModel: MutableLiveData<Iphone11ProMaxSevenModel> =
      MutableLiveData(Iphone11ProMaxSevenModel())

  var navArguments: Bundle? = null
}
