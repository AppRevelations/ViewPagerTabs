ViewPagerTabs
=============

Create tab layout using Fragments and Viewpager. Also you can swipe between tab view as it is the functionality of Viewpager
which is not possible when use TabHost.

MainActivity.java

Setting a PageChangeListener on ViewPager.

 viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
	 
	            @Override
	            public void onPageSelected(int position) {
	               
	               
	   //Select respective Tab
	                actionBar.setSelectedNavigationItem(position);
	            }
	 
	            @Override
	            public void onPageScrolled(int arg0, float arg1, int arg2) {
	            }
	 
	            @Override
	            public void onPageScrollStateChanged(int arg0) {
	            }
	        });

If Tab is selected then show respective fragment view.

	    public void onTabSelected(Tab tab, FragmentTransaction ft) {
	        
	        viewPager.setCurrentItem(tab.getPosition());
	    }
