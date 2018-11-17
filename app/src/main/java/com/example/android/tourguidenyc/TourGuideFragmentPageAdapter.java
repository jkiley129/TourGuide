package com.example.android.tourguidenyc;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourGuideFragmentPageAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public TourGuideFragmentPageAdapter(FragmentManager fm, Context context) {

        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantFragment();
        } else if (position == 1) {
            return new SightsFragment();
        } else if (position == 2) {
            return new VenuesFragment();
        } else {
            return new BarsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.tab_food);
            case 1:
                return mContext.getString(R.string.tab_sights);
            case 2:
                return mContext.getString(R.string.tab_venues);
            case 3:
                return mContext.getString(R.string.tab_bars);
            default:
                return null;
        }
    }
}
