package com.combodeal.app.modules.location.ui

import androidx.activity.viewModels
import com.combodeal.app.R
import com.combodeal.app.appcomponents.base.BaseActivity
import com.combodeal.app.databinding.ActivityLocationBinding
import com.combodeal.app.modules.location.`data`.viewmodel.LocationVM
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import kotlin.String
import kotlin.Unit

class LocationActivity : BaseActivity<ActivityLocationBinding>(R.layout.activity_location),
    OnMapReadyCallback {
  private val viewModel: LocationVM by viewModels<LocationVM>()

  private var mMap: GoogleMap? = null


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationVM = viewModel
    val mapFragment = supportFragmentManager.findFragmentById(R.id.mapImage) as?
    SupportMapFragment
    mapFragment?.getMapAsync(this)
  }

  override fun onMapReady(p0: GoogleMap): Unit {
    mMap = p0
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "LOCATION_ACTIVITY"

  }
}
