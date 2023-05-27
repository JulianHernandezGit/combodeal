package com.combodeal.app.modules.viewticket.`data`.model

import com.combodeal.app.R
import com.combodeal.app.appcomponents.di.MyApp
import kotlin.String

data class ViewTicketModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTicket: String? = MyApp.getInstance().resources.getString(R.string.lbl_ticket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalepresidentOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_royale_presiden)

)
