package com.mohammedsapplication.app.modules.iphone11promaxeleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohammedsapplication.app.modules.iphone11promaxeleven.`data`.model.Iphone11ProMaxElevenModel
import com.mohammedsapplication.app.modules.iphone11promaxeleven.`data`.model.ListcomponentlottRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone11ProMaxElevenVM : ViewModel(), KoinComponent {
  val iphone11ProMaxElevenModel: MutableLiveData<Iphone11ProMaxElevenModel> =
      MutableLiveData(Iphone11ProMaxElevenModel())

  var navArguments: Bundle? = null

  val listcomponentlottList: MutableLiveData<MutableList<ListcomponentlottRowModel>> =
      MutableLiveData(mutableListOf())
}
