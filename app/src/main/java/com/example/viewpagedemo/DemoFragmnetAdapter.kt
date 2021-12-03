package com.example.viewpagedemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class DemoFragmnetAdapter(val fm:FragmentManager):FragmentStatePagerAdapter(fm) {

    override fun getCount(): Int = 100

    override fun getItem(position: Int): Fragment {

        val demoFragment = DemoFragment()
        val bundle = Bundle()
        val pos = position+1
        bundle.putString("message","We are currently in page number $pos")
        demoFragment.arguments = bundle

        return demoFragment
    }
}