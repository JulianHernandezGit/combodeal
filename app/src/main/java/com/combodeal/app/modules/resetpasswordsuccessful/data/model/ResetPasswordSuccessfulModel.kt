package com.combodeal.app.modules.resetpasswordsuccessful.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtModaltitle: String? = MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_account_is)

)
