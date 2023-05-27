package com.combodeal.app.modules.filterresult.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class FilterResultModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommended5863One: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_58)

)
