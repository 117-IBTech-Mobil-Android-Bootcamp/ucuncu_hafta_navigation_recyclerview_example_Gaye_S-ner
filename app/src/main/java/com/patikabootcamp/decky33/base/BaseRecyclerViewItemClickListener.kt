package com.patikabootcamp.decky33.base

import androidx.annotation.IdRes

interface BaseRecyclerViewItemClickListener<T>{

    fun onItemClicked(clickedObject : T, @IdRes id : Int = 0)
}