package com.combodeal.app.modules.review.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeal.app.modules.review.`data`.model.ListellipseoneRowModel
import com.combodeal.app.modules.review.`data`.model.Liststar1RowModel
import com.combodeal.app.modules.review.`data`.model.ReviewModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReviewVM : ViewModel(), KoinComponent {
  val reviewModel: MutableLiveData<ReviewModel> = MutableLiveData(ReviewModel())

  var navArguments: Bundle? = null

  val liststarList: MutableLiveData<MutableList<Liststar1RowModel>> =
      MutableLiveData(mutableListOf())

  val listellipseoneList: MutableLiveData<MutableList<ListellipseoneRowModel>> =
      MutableLiveData(mutableListOf())
}
