package com.combodeal.app.modules.onboardingone.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTravelsafelycomOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_travel_safely)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)

)
