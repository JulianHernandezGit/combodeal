package com.combodeal.app.modules.searchpage.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class ListsizemediumtypefRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizemediumtypef: String? = MyApp.getInstance().resources.getString(R.string.lbl_all_hotel)

)
