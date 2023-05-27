package com.combodeal.app.modules.notifications.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYesterday: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)

)
