package com.combodeal.app.modules.searchtype.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.combodeal.app.R
import com.combodeal.app.appcomponents.base.BaseActivity
import com.combodeal.app.databinding.ActivitySearchTypeBinding
import com.combodeal.app.modules.searchtype.`data`.model.Listsizemediumtypef1RowModel
import com.combodeal.app.modules.searchtype.`data`.viewmodel.SearchTypeVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchTypeActivity : BaseActivity<ActivitySearchTypeBinding>(R.layout.activity_search_type) {
  private val viewModel: SearchTypeVM by viewModels<SearchTypeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsizemediumtypefAdapter =
    ListsizemediumtypefAdapter(viewModel.listsizemediumtypefList.value?:mutableListOf())
    binding.recyclerListsizemediumtypef.adapter = listsizemediumtypefAdapter
    listsizemediumtypefAdapter.setOnItemClickListener(
    object : ListsizemediumtypefAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsizemediumtypef1RowModel) {
        onClickRecyclerListsizemediumtypef(view, position, item)
      }
    }
    )
    viewModel.listsizemediumtypefList.observe(this) {
      listsizemediumtypefAdapter.updateData(it)
    }
    binding.searchTypeVM = viewModel
    setUpSearchViewSearchbarListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsizemediumtypef(
    view: View,
    position: Int,
    item: Listsizemediumtypef1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchbarListener(): Unit {
    binding.searchViewSearchbar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_TYPE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchTypeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
