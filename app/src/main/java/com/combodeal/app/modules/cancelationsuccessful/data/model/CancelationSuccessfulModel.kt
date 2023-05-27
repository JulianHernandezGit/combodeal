package com.combodeal.app.modules.cancelationsuccessful.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class CancelationSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtModaltitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_successfull)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_succes)

)
