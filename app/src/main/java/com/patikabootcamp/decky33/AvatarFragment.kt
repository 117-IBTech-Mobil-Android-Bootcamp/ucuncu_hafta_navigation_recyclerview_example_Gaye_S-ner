package com.patikabootcamp.decky33

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.patikabootcamp.decky33.base.BaseFragment
import com.patikabootcamp.decky33.base.NoBarBaseFragment
import com.patikabootcamp.decky33.model.Avatar
import kotlinx.android.synthetic.main.fragment_avatar.*


class AvatarFragment : NoBarBaseFragment() {
    private lateinit var choose_avatar_adapter: ChooseAvatarAdapter


    override fun getLayoutID(): Int = R.layout.fragment_avatar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val baseActivity = activity as MainActivity
        baseActivity.hideNavigation()
        prepareView()

    }

    private fun prepareView() {
        (requireActivity() as MainActivity).hideNavigation()

        val avatar1 = Avatar(true, R.drawable.avatar01)
        val avatar2 = Avatar(false, R.drawable.avatar02)
        val avatar3 = Avatar(false, R.drawable.avatar03)
        val avatar4 = Avatar(false, R.drawable.avatar04)
        val avatar5 = Avatar(false, R.drawable.avatar05)
        val avatar6 = Avatar(false, R.drawable.avatar06)
        val avatar7 = Avatar(false, R.drawable.avatar07)
        val avatar8 = Avatar(false, R.drawable.avatar08)
        val avatar9 = Avatar(false, R.drawable.avatar09)


        val list = mutableListOf(avatar1, avatar2,avatar3,avatar4, avatar5, avatar6,avatar7, avatar8, avatar9)


        choose_avatar_adapter = ChooseAvatarAdapter(requireContext(), list){
            list.forEach {
                it.isChoosen = false
                it.select_button = R.drawable.noselect
            }
            it.isChoosen = true
            it.select_button = R.drawable.tik
            val linearLayoutManager = GridLayoutManager(requireContext(), 3)
            avatar_recycler_view.layoutManager = linearLayoutManager
            avatar_recycler_view.adapter  = choose_avatar_adapter


        }


        val linearLayoutManager = GridLayoutManager(requireContext(), 3)
        avatar_recycler_view.layoutManager = linearLayoutManager
        avatar_recycler_view.adapter  = choose_avatar_adapter

    }



}