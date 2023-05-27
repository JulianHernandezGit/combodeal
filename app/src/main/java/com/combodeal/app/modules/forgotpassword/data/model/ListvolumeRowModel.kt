package com.combodeal.app.modules.forgotpassword.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class ListvolumeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtViasms: String? = MyApp.getInstance().resources.getString(R.string.lbl_via_sms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt111199: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_111_99)

)
