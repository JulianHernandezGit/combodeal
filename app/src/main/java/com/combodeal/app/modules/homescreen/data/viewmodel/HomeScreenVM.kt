package com.combodeal.app.modules.homescreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeal.app.modules.homescreen.`data`.model.HomeScreenModel
import com.combodeal.app.modules.homescreen.`data`.model.HotelsRowModel
import com.combodeal.app.modules.homescreen.`data`.model.ListrectanglefourRowModel
import com.combodeal.app.modules.homescreen.`data`.model.OptionsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeScreenVM : ViewModel(), KoinComponent {
  val homeScreenModel: MutableLiveData<HomeScreenModel> = MutableLiveData(HomeScreenModel())

  var navArguments: Bundle? = null

  val optionsList: MutableLiveData<MutableList<OptionsRowModel>> = MutableLiveData(mutableListOf())

  val hotelsList: MutableLiveData<MutableList<HotelsRowModel>> = MutableLiveData(mutableListOf())

  val listrectanglefourList: MutableLiveData<MutableList<ListrectanglefourRowModel>> =
      MutableLiveData(mutableListOf())
}
