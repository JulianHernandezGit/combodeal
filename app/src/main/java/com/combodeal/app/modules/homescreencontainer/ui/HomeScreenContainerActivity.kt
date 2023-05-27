package com.combodeal.app.modules.homescreencontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.combodeal.app.R
import com.combodeal.app.appcomponents.base.BaseActivity
import com.combodeal.app.databinding.ActivityHomeScreenContainerBinding
import com.combodeal.app.extensions.loadFragment
import com.combodeal.app.modules.bookingongoingtabcontainer.ui.BookingOngoingTabContainerFragment
import com.combodeal.app.modules.homescreen.ui.HomeScreenFragment
import com.combodeal.app.modules.homescreencontainer.`data`.viewmodel.HomeScreenContainerVM
import com.combodeal.app.modules.profilesettings.ui.ProfileSettingsFragment
import com.combodeal.app.modules.searchpage.ui.SearchPageFragment
import kotlin.String
import kotlin.Unit

class HomeScreenContainerActivity :
    BaseActivity<ActivityHomeScreenContainerBinding>(R.layout.activity_home_screen_container) {
  private val viewModel: HomeScreenContainerVM by viewModels<HomeScreenContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenContainerVM = viewModel
    val destFragment = HomeScreenFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = HomeScreenFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnuser.setOnClickListener {
      val destFragment = ProfileSettingsFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ProfileSettingsFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnmenu.setOnClickListener {
      val destFragment = BookingOngoingTabContainerFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = BookingOngoingTabContainerFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnsearch.setOnClickListener {
      val destFragment = SearchPageFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = SearchPageFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnhome.setOnClickListener {
      val destFragment = HomeScreenFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = HomeScreenFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeScreenContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
