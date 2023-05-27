package com.combodeal.app.modules.mybookmarks.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class MyBookmarksModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMybookmarks: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bookmarks)

)
