package akakom.nomhs.myuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

//        val frag_data =DataFragment()
//        val frag_upload = UploadFragment()
//        val frag_info = InfoFragment()
//        val frag_profile = ProfileFragment()
//
//        currentFragment(frag_data)
////
//        nav_view.setOnNavigationItemSelectedListener{
//            when(it.itemId){
//                R.id.nav_data -> currentFragment(frag_data)
//                R.id.nav_upload -> currentFragment(frag_upload)
//                R.id.nav_info -> currentFragment(frag_info)
//                R.id.nav_profile -> currentFragment(frag_profile)
//            }
//            true
//
//        }

        val navController = Navigation.findNavController(this,R.id.fragment_container)
        NavigationUI.setupWithNavController(nav_view, navController)
        NavigationUI.setupActionBarWithNavController(this, navController,drawer_layout)

        val toogle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toogle)
        toogle.syncState()
    }

//    private fun currentFragment(fragment: Fragment) {
//        supportFragmentManager.beginTransaction().apply{
//            replace(R.id.drawer_layout,fragment)
//            commit()
//        }
////
//    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)

        } else {
            super.onBackPressed()
        }
    }

}

