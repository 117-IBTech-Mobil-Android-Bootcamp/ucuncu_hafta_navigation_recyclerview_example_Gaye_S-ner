package com.patikabootcamp.decky33.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleObserver
import com.patikabootcamp.decky33.MainActivity

abstract class NoBarBaseFragment : Fragment(), FragmentInterface {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutID(), container, false)
    }

    override fun onResume() {
        super.onResume()
        val baseActivity = activity as MainActivity
            baseActivity.hideNavigation()
    }

    abstract fun getLayoutID() : Int


}