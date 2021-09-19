package com.patikabootcamp.decky33

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import com.patikabootcamp.decky33.base.BaseRecyclerAdapter
import com.patikabootcamp.decky33.model.Avatar

class ChooseAvatarAdapter (val mContext : Context, mList : List<Avatar>, val block: (Avatar) -> Unit): BaseRecyclerAdapter<Avatar, ChooseAvatarAdapter.WordViewHolder>(mList, block)
{


    override fun bind(bindedObject: Avatar, holder: WordViewHolder) {
        holder.setData(bindedObject)
        holder.setOnClickListener(bindedObject, block)
    }


    override fun getViewHolder(container : ViewGroup): WordViewHolder  = WordViewHolder(LayoutInflater.from(mContext).inflate(R.layout.avatar_card, container, false), block)

    inner class WordViewHolder(rootView: View, block: (Avatar) -> Unit) : BaseViewHolder(rootView, block) {


        val ic_avatar = rootView.findViewById<AppCompatImageView>(R.id.ic_avatar)
        val ic_tik = rootView.findViewById<AppCompatImageView>(R.id.ic_tik)



        override fun setData(model: Avatar) {
            super.setData(model)
            ic_avatar.setImageResource(model.str_img_source)

            if (!model.isChoosen)
                ic_tik.setImageResource(model.select_button)
            else
                ic_tik.setImageResource(R.drawable.tik)
        }


    }



}