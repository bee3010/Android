package com.example.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CartFragment();
            case 1:
                return new HomeFragment();
            case 2:
                return new OrderFragment();
            default:
                return new CartFragment();
        }
    }
    @Override
    public int getCount() {
        return 3;
    }
}

