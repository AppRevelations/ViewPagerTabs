package com.apprevelations.viewpagertabs;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.Button;

@SuppressLint("NewApi")
public class MainActivity extends FragmentActivity implements ActionBar.TabListener
{

	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;
	
	// Tab titles
	private String[] Tabs = { "Tab1", "Tab2", "Tab3" };

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		    setContentView(R.layout.activity_main);
		 
	       
	        viewPager = (ViewPager) findViewById(R.id.Vpager);
	        actionBar = getActionBar();
	        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
	 
	        viewPager.setAdapter(mAdapter);
	        actionBar.setHomeButtonEnabled(false);
	        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);       
	 
	        // Adding Tabs
	        for (String tab_name : Tabs) {
	            actionBar.addTab(actionBar.newTab().setText(tab_name)
	                    .setTabListener(this));
	        }
	 
	        
	        // Setting a PageChangeListener on ViewPager
	         
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
	    
	    }
	         
	    @Override
	    public void onTabReselected(Tab tab, FragmentTransaction ft) {
	    }
	 
	    @Override
	    public void onTabSelected(Tab tab, FragmentTransaction ft) {
	        
	        //on tab selection show respective fragment view. 
	        viewPager.setCurrentItem(tab.getPosition());
	    }
	 
	    @Override
	    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	    }
	 
	}