package com.combodeal.app.modules.addnewcard.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class AddNewCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddnewcard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_new_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCardholdernameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCardnumberValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etExpirydateValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCvvValue: String? = null
)
