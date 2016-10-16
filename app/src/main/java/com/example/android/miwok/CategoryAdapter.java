package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by namlu on 15-Oct-16.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /*
     * @param tabTitles[]
     * @param context the context of the app
     */
    private Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else{
            return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return context.getString(R.string.category_numbers);
        } else if (position == 1) {
            return context.getString(R.string.category_family);
        } else if (position == 2) {
            return context.getString(R.string.category_colors);
        } else {
            return context.getString(R.string.category_phrases);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
