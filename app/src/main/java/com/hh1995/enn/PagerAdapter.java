package com.hh1995.enn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    Fragment[] fragments=new Fragment[3];
    String[] tabTitles=new String[]{"상품", "이벤트", "공지"};

    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0]=new Product_Frag();
        fragments[1]=new Event_Frag();
        fragments[2]=new Review_Frag();
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
