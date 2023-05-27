package com.combodeal.app.modules.ratehotel.ui

import androidx.fragment.app.viewModels
import com.combodeal.app.R
import com.combodeal.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.combodeal.app.databinding.BottomsheetRateHotelBinding
import com.combodeal.app.modules.ratehotel.`data`.viewmodel.RateHotelVM
import kotlin.String
import kotlin.Unit

class RateHotelBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetRateHotelBinding>(R.layout.bottomsheet_rate_hotel) {
  private val viewModel: RateHotelVM by viewModels<RateHotelVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.rateHotelVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RATE_HOTEL_BOTTOMSHEET"

  }
}
