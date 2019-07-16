package com.example.navigationdraweractivitydemo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        //To change body of created functions use File | Settings | File Templates.
        return when(position){
            0 -> {HomeFragment()}
            1 -> {LatestFragment()}
            else -> {return DownloadMostFragment()}
        }
    }

    override fun getCount(): Int {
        //To change body of created functions use File | Settings | File Templates.
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "BXH nhạc Việt"
            1 -> "Mới nhất"
            else -> {
                return "Tải nhiều nhất"
            }
        }
    }
}