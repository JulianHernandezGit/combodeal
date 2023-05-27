package com.combodeal.app.modules.searchpage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.combodeal.app.R
import com.combodeal.app.appcomponents.base.BaseFragment
import com.combodeal.app.databinding.FragmentSearchPageBinding
import com.combodeal.app.modules.searchpage.`data`.model.Listrectanglefour1RowModel
import com.combodeal.app.modules.searchpage.`data`.model.ListsizemediumtypefRowModel
import com.combodeal.app.modules.searchpage.`data`.viewmodel.SearchPageVM
import com.combodeal.app.modules.searchtype.ui.SearchTypeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchPageFragment : BaseFragment<FragmentSearchPageBinding>(R.layout.fragment_search_page) {
  private val viewModel: SearchPageVM by viewModels<SearchPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listsizemediumtypefAdapter =
    ListsizemediumtypefAdapter(viewModel.listsizemediumtypefList.value?:mutableListOf())
    binding.recyclerListsizemediumtypef.adapter = listsizemediumtypefAdapter
    listsizemediumtypefAdapter.setOnItemClickListener(
    object : ListsizemediumtypefAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsizemediumtypefRowModel) {
        onClickRecyclerListsizemediumtypef(view, position, item)
      }
    }
    )
    viewModel.listsizemediumtypefList.observe(requireActivity()) {
      listsizemediumtypefAdapter.updateData(it)
    }
    val listrectanglefourAdapter =
    ListrectanglefourAdapter(viewModel.listrectanglefourList.value?:mutableListOf())
    binding.recyclerListrectanglefour.adapter = listrectanglefourAdapter
    listrectanglefourAdapter.setOnItemClickListener(
    object : ListrectanglefourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglefour1RowModel) {
        onClickRecyclerListrectanglefour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourList.observe(requireActivity()) {
      listrectanglefourAdapter.updateData(it)
    }
    binding.searchPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.searchViewSearchbar.setOnClickListener {
      val destIntent = SearchTypeActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListsizemediumtypef(
    view: View,
    position: Int,
    item: ListsizemediumtypefRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglefour(
    view: View,
    position: Int,
    item: Listrectanglefour1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_PAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): SearchPageFragment {
      val fragment = SearchPageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
