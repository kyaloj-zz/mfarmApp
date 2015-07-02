package com.fragments.justus.mfarmapp;

import android.app.Activity;
import android.content.Intent;
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

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialSection;


public class NavigationDrawer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        String[] list = {"Profile", "Daily prices", "Trends", "Blog", "Planting guide","Marketplace", "About MFarm", "Settings", "Logout"};
        ListView myList = (ListView)findViewById(R.id.listView);

        ListAdapter listAdapter = new ArrayAdapter<String>(this,R.layout.mylistviewitems,R.id.textView,list);
        myList.setAdapter(listAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String toast = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(),Trends.class);
                startActivity(intent);
                switch (i) {
                    case 0:


                }

            }
        });

    }
}
