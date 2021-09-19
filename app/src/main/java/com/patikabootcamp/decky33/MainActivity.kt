package com.patikabootcamp.decky33

import addFragment
import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.patikabootcamp.decky33.databinding.ActivityMainBinding
import gone
import kotlinx.android.synthetic.main.activity_main.*
import visible
import android.content.DialogInterface




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideNavigation()
        addFragment(SplashFragment(), R.id.nav_host_fragment_activity_main)


        val navView: BottomNavigationView = binding.navView
        val radius = resources.getDimension(R.dimen.cornerSize)

        val shapeDrawable : MaterialShapeDrawable = navView.background as MaterialShapeDrawable
        shapeDrawable.shapeAppearanceModel = shapeDrawable.shapeAppearanceModel
            .toBuilder()
            .setAllCorners(CornerFamily.ROUNDED, radius)
            .build()

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        navView.setupWithNavController(navController)
    }

    fun hideNavigation() {
        nav_view.postDelayed(
            {
                nav_view.gone()

            }, 50
        )
    }

    fun showNavigation() {
        nav_view.postDelayed(
            {
                nav_view.visible()

            }, 50
        )
    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount<=0){
            AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton(
                    "Yes"
                ) { dialog, id -> super.onBackPressed() }
                .setNegativeButton("No", null)
                .show()
        }

    }

}