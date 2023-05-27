package com.combodeal.app.modules.location.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class LocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHotellocation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hotel_location)

)
