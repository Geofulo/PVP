package com.agmcompany.pvp;

import java.util.Locale;

import com.agmcompany.pvp.fragments.ActividadFragment;
import com.agmcompany.pvp.fragments.CarrerasFragment;
import com.agmcompany.pvp.fragments.EscuelasFragment;
import com.agmcompany.pvp.fragments.InstitucionesFragment;
import com.agmcompany.pvp.fragments.TrabajosFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
     * will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;
     

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the app.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

    	public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a DummySectionFragment (defined as a static inner class
            // below) with the page number as its lone argument.
        	
        	Fragment fragment = null;
        	
        	switch(position){
        		case 0:
        			fragment = new TrabajosFragment();
        			break;
        		case 1:
        			fragment = new CarrerasFragment();
        			break;
        		case 2:
        			fragment = new ActividadFragment();
        			break;
        		case 3:
        			fragment = new EscuelasFragment();
        			break;
        		case 4:
        			fragment = new InstitucionesFragment();
        			break;
        		default:
        			break;
        	}
        	
        	Bundle args = new Bundle();
        	fragment.setArguments(args);
        	return fragment;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.tab_trabajos).toUpperCase(l);
                case 1:
                    return getString(R.string.tab_carreras).toUpperCase(l);
                case 2:
                    return getString(R.string.tab_actividad).toUpperCase(l);
                case 3:
                    return getString(R.string.tab_escuelas).toUpperCase(l);
                case 4:
                    return getString(R.string.tab_instituciones).toUpperCase(l);
            }
            return null;
        }
    }

}
