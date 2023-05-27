package com.combodeal.app.modules.choosepaymentmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeal.app.modules.choosepaymentmethod.`data`.model.ChoosePaymentMethodModel
import com.combodeal.app.modules.choosepaymentmethod.`data`.model.ListreplyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChoosePaymentMethodVM : ViewModel(), KoinComponent {
  val choosePaymentMethodModel: MutableLiveData<ChoosePaymentMethodModel> =
      MutableLiveData(ChoosePaymentMethodModel())

  var navArguments: Bundle? = null

  val listreplyList: MutableLiveData<MutableList<ListreplyRowModel>> =
      MutableLiveData(mutableListOf())
}
