package com.combodeal.app.modules.profilesettings.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.combodeal.app.R
import com.combodeal.app.appcomponents.base.BaseFragment
import com.combodeal.app.databinding.FragmentProfileSettingsBinding
import com.combodeal.app.modules.editprofile.ui.EditProfileActivity
import com.combodeal.app.modules.logout.ui.LogoutBottomsheet
import com.combodeal.app.modules.notificationsettings.ui.NotificationSettingsActivity
import com.combodeal.app.modules.profilesettings.`data`.viewmodel.ProfileSettingsVM
import com.combodeal.app.modules.security.ui.SecurityActivity
import kotlin.String
import kotlin.Unit

class ProfileSettingsFragment :
    BaseFragment<FragmentProfileSettingsBinding>(R.layout.fragment_profile_settings) {
  private val viewModel: ProfileSettingsVM by viewModels<ProfileSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowrefresh.setOnClickListener {
      val destFragment = LogoutBottomsheet.getInstance(null)
      destFragment.show(requireActivity().supportFragmentManager, LogoutBottomsheet.TAG)
    }
    binding.linearRowalarm.setOnClickListener {
      val destIntent = NotificationSettingsActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowcheckmark.setOnClickListener {
      val destIntent = SecurityActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowuser.setOnClickListener {
      val destIntent = EditProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_SETTINGS_FRAGMENT"


    fun getInstance(bundle: Bundle?): ProfileSettingsFragment {
      val fragment = ProfileSettingsFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
