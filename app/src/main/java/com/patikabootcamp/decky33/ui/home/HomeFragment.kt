package com.patikabootcamp.decky33.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.patikabootcamp.decky33.R
import com.patikabootcamp.decky33.base.BaseFragment
import com.patikabootcamp.decky33.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment() {

    override fun getLayoutID(): Int =R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}