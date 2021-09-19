package com.patikabootcamp.decky33.model

import com.patikabootcamp.decky33.R
import java.io.Serializable

data class Avatar(
    var isChoosen : Boolean,
    var str_img_source: Int,
    var select_button: Int = R.drawable.noselect
) : Serializable