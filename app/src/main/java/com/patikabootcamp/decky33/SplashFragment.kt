package com.patikabootcamp.decky33

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.patikabootcamp.decky33.base.BaseFragment
import com.patikabootcamp.decky33.base.NoBarBaseFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_splash.*
import visible

class SplashFragment : NoBarBaseFragment() {
    override fun getLayoutID(): Int = R.layout.fragment_splash
    private var i = 0
    private val handler = Handler()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // setting the progressbar visibility to visible
        progressBar.visibility = View.VISIBLE
        i = progressBar.progress

        Thread {
            while (i < 3) {
                i += 1
                handler.post{
                    progressBar.progress = i
                }
                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }

            progressBar.visibility = View.INVISIBLE
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
            val baseActivity = activity as MainActivity
            baseActivity.showNavigation()



        }.start()



    }

}