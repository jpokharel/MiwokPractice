package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jiwanpokharel89 on 8/26/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String[] tabTitles = new String[]{"Numbers","Family","Colors","Phrases"};


    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new NumbersFragment();
        }else if(position == 1){
            return new FamilyFragment();
        }else if(position == 2){
            return new ColorsFragment();
        }else{
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
        //return super.getPageTitle(position);
    }
}
