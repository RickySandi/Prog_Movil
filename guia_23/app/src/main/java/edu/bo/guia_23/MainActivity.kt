package edu.bo.guia_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.IdRes
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    lateinit var mainPageAdapter: MainPageAdapter

    private val bottomNavigationView: NavigationBarView
        get() = findViewById(R.id.bottomNavigationView)

    private val toolbar2: Toolbar
        get() = findViewById(R.id.toolbar2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initialize components/views
        mainPageAdapter = MainPageAdapter(supportFragmentManager)
        setSupportActionBar(toolbar2)
        mainPageAdapter.setItems(arrayListOf( MainScreen.PROFILE, MainScreen.HOME))
        main_view_pager.adapter = mainPageAdapter



        bottomNavigationView.setOnItemSelectedListener(this)
        main_view_pager.addOnPageChangeListener( object: ViewPager.SimpleOnPageChangeListener() {
            override fun onPageSelected(position: Int) {
                val selectedScreen = mainPageAdapter.getItems()[position]
                selectBottomNavigationViewMenuItem(selectedScreen.menuItemId)
                supportActionBar?.setTitle(selectedScreen.titleStringId)
            }
        })
    }

    private fun selectBottomNavigationViewMenuItem(@IdRes menuItemId: Int) {
        bottomNavigationView.setOnItemSelectedListener(null)
        bottomNavigationView.selectedItemId = menuItemId
        bottomNavigationView.setOnItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        getMainScreenForMenuItem(item.itemId)?.let {
            scrollToScreen(it)
            supportActionBar?.setTitle(it.titleStringId)
            return true
        }
        return false
    }

    private fun scrollToScreen(it: MainScreen) {
        val screenPosition = mainPageAdapter.getItems().indexOf(it)
        if(screenPosition != main_view_pager.currentItem) {
            main_view_pager.currentItem = screenPosition
        }
    }
}
