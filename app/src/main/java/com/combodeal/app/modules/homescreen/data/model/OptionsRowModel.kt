package com.combodeal.app.modules.homescreen.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class OptionsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizemediumtypef: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recommended)

)
