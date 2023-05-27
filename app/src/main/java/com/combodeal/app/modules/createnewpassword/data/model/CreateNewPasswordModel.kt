package com.combodeal.app.modules.createnewpassword.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class CreateNewPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyournew: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etConfirmpasswordinputValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etConfirmpasswordinputOneValue: String? = null
)
