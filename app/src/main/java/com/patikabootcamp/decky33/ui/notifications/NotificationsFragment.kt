package com.patikabootcamp.decky33.ui.notifications

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
import com.patikabootcamp.decky33.databinding.FragmentNotificationsBinding
import kotlinx.android.synthetic.main.fragment_notifications.*
import navigateToNextFragment

class NotificationsFragment : BaseFragment() {


    override fun getLayoutID(): Int = R.layout.fragment_notifications

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        edit.setOnClickListener {
            navigateToNextFragment(R.id.action_fragment_profile_to_fragment_avatar)
        }

    }

}