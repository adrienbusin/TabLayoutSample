package fr.busin.tablayout

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Implémentation du viewPager (Pour afficher les fragments first et second)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = SectionsPagerAdapter(this, supportFragmentManager)

        //Implémentation du tabeLayout pour afficher le titre des tabs
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

    }

    //implémentation du PagerAdapter qui s'occupe d'afficher les différents fragments (first ou second ici) par swipe et par click sur le tab
    class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
        : FragmentPagerAdapter(fm) {

        private val TAB_TITLES = arrayOf(R.string.tab_text_1, R.string.tab_text_2)

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> FirstFragment()
                else -> SecondFragment()
            }
        }

        override fun getPageTitle(position: Int): CharSequence {
            return context.resources.getString(TAB_TITLES[position])
        }

        override fun getCount(): Int {
            return TAB_TITLES.size
        }
    }
}