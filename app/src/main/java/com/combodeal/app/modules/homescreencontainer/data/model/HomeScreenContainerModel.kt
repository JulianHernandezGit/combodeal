package com.combodeal.app.modules.homescreencontainer.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBooking: String? = MyApp.getInstance().resources.getString(R.string.lbl_booking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
