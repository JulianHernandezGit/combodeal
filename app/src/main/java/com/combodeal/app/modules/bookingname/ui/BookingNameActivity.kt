package com.combodeal.app.modules.bookingname.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.combodeal.app.R
import com.combodeal.app.appcomponents.base.BaseActivity
import com.combodeal.app.databinding.ActivityBookingNameBinding
import com.combodeal.app.modules.bookingname.`data`.viewmodel.BookingNameVM
import com.combodeal.app.modules.choosepaymentmethod.ui.ChoosePaymentMethodActivity
import kotlin.String
import kotlin.Unit

class BookingNameActivity : BaseActivity<ActivityBookingNameBinding>(R.layout.activity_booking_name)
    {
  private val viewModel: BookingNameVM by viewModels<BookingNameVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookingNameVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = ChoosePaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKING_NAME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookingNameActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
