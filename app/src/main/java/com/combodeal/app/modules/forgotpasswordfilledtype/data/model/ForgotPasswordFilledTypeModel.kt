package com.combodeal.app.modules.forgotpasswordfilledtype.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordFilledTypeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCodehasbeensendOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_code_has_been_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendcodeinFiftyThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resend_code_in)

)
