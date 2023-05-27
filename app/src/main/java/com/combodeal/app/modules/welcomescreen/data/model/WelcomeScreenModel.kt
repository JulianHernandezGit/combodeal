package com.combodeal.app.modules.welcomescreen.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometo: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComfort: String? = MyApp.getInstance().resources.getString(R.string.lbl_comfort)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThebesthotelbooOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_best_hotel)

)
