package com.fragments.justus.mfarmapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.fragments.justus.mfarmapp.mockedActivity.Settings;
import com.fragments.justus.mfarmapp.mockedFragments.AboutUsFragment;
import com.fragments.justus.mfarmapp.mockedFragments.BlogFragment;
import com.fragments.justus.mfarmapp.mockedFragments.FragmentIndex;
import com.fragments.justus.mfarmapp.mockedFragments.MarketPlaceFragment;
import com.fragments.justus.mfarmapp.mockedFragments.TrendsFragment;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;
import it.neokree.materialnavigationdrawer.elements.MaterialSection;


public class NavigationDrawer extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle savedInstanceState) {
        // add accounts
        MaterialAccount account = new MaterialAccount(this.getResources(),"Justus K Mbaluka","jmbaluka@mfarm.co.ke", R.drawable.me, R.drawable.bamboo);
        this.addAccount(account);


        // create sections
        this.addSection(newSection("Daily Prices", R.drawable.ic_mic_white_24dp, new FragmentIndex()));
        this.addSection(newSection("Trends", R.drawable.ic_hotel_grey600_24dp, new TrendsFragment()));
        this.addSection(newSection("Blog", R.drawable.ic_mic_white_24dp, new BlogFragment()));
        this.addSection(newSection("Marketplace", R.drawable.ic_hotel_grey600_24dp, new MarketPlaceFragment()));
        this.addSection(newSection("About Us", R.drawable.ic_mic_white_24dp, new AboutUsFragment()));
        this.addSection(newSection("Logout", R.drawable.ic_hotel_grey600_24dp, new Intent(this, LoginPage.class)));



        // create bottom section
        this.addBottomSection(newSection("Settings", R.drawable.ic_settings_black_24dp, new Intent(this, Settings.class)));
    }
}
