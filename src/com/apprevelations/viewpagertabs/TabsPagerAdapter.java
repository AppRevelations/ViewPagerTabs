package com.apprevelations.viewpagertabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Tab1 fragment 
			return new Tab1();
		case 1:
			// Tab2 fragment 
			return new Tab2();
		case 2:
			// Tab3 fragment
			return new Tab3();
		}

		return null;
	}
      
	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
