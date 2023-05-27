package com.combodeal.app.modules.searchfilter.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class Listsizemediumtypef2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizemediumtypef: String? =
      MyApp.getInstance().resources.getString(R.string.msg_highest_popular)

)
