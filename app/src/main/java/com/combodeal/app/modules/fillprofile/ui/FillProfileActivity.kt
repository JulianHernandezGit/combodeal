package com.combodeal.app.modules.fillprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.combodeal.app.R
import com.combodeal.app.appcomponents.base.BaseActivity
import com.combodeal.app.databinding.ActivityFillProfileBinding
import com.combodeal.app.extensions.NoInternetConnection
import com.combodeal.app.extensions.isJSONObject
import com.combodeal.app.extensions.showProgressDialog
import com.combodeal.app.modules.fillprofile.`data`.model.SpinnerGenderModel
import com.combodeal.app.modules.fillprofile.`data`.viewmodel.FillProfileVM
import com.combodeal.app.modules.homescreencontainer.ui.HomeScreenContainerActivity
import com.combodeal.app.network.models.createregister.CreateRegisterResponse
import com.combodeal.app.network.resources.ErrorResponse
import com.combodeal.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class FillProfileActivity : BaseActivity<ActivityFillProfileBinding>(R.layout.activity_fill_profile)
    {
  private val viewModel: FillProfileVM by viewModels<FillProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGenderList.value = mutableListOf(
    SpinnerGenderModel("Item1"),
    SpinnerGenderModel("Item2"),
    SpinnerGenderModel("Item3"),
    SpinnerGenderModel("Item4"),
    SpinnerGenderModel("Item5")
    )
    val spinnerGenderAdapter =
    SpinnerGenderAdapter(this,R.layout.spinner_item,viewModel.spinnerGenderList.value?:
    mutableListOf())
    binding.spinnerGender.adapter = spinnerGenderAdapter
    binding.fillProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  override fun addObservers() {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@FillProfileActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@FillProfileActivity.showProgressDialog()
      } else  {
        progressDialog?.dismiss()
      }
    }
    viewModel.createRegisterLiveData.observe(this@FillProfileActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateRegister(it)
      } else if(it is ErrorResponse)  {
        onErrorCreateRegister(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateRegister(response: SuccessResponse<CreateRegisterResponse>) {
    viewModel.bindCreateRegisterResponse(response.data)
    val destBundle = Bundle()
    destBundle.putString("id",Gson().toJson(viewModel.createRegisterLiveData.value?.getSuccessResponse()?.))
    val destIntent = HomeScreenContainerActivity.getIntent(this, destBundle)
    destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    startActivity(destIntent)
  }

  private fun onErrorCreateRegister(exception: Exception) {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
            else JSONObject()
        val errMessage = if(!errorObject.optString("message").isNullOrEmpty()) {
          errorObject.optString("message").toString()
        } else {
           exception.response()?.message()?:""
        }
        Toast.makeText(this@FillProfileActivity,errMessage,Toast.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "FILL_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FillProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
