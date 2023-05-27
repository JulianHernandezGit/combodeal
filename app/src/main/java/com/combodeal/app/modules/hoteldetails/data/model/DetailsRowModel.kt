package com.combodeal.app.modules.hoteldetails.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class DetailsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJennywilson: String? = MyApp.getInstance().resources.getString(R.string.lbl_jenny_wilson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDec102024: String? = MyApp.getInstance().resources.getString(R.string.lbl_dec_10_2024)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdipiscingelit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_very_nice_and_c)

)
