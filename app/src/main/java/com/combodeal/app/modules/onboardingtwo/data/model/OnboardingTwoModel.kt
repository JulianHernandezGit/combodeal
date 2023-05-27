package com.combodeal.app.modules.onboardingtwo.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindthebesthoteOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_the_best_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)

)
