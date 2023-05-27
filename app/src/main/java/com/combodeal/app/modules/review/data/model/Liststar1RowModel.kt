package com.combodeal.app.modules.review.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class Liststar1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChips: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)

)
