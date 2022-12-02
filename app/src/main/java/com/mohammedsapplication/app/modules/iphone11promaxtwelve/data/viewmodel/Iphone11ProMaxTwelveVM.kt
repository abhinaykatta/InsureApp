package com.mohammedsapplication.app.modules.iphone11promaxtwelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxtwelve.`data`.model.Iphone11ProMaxTwelveModel
import com.mohammedsapplication.app.modules.iphone11promaxtwelve.`data`.model.Listcomponentlott1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone11ProMaxTwelveVM : ViewModel(), KoinComponent {
  val iphone11ProMaxTwelveModel: MutableLiveData<Iphone11ProMaxTwelveModel> =
      MutableLiveData(Iphone11ProMaxTwelveModel())

  var navArguments: Bundle? = null

  val listcomponentlottList: MutableLiveData<MutableList<Listcomponentlott1RowModel>> =
      MutableLiveData(mutableListOf())
}
