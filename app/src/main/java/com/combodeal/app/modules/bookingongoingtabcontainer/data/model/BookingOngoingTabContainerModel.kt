package com.combodeal.app.modules.bookingongoingtabcontainer.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class BookingOngoingTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMybookings: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bookings)

)
