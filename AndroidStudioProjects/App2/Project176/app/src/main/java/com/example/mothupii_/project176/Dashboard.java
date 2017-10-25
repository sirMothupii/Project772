package com.example.mothupii_.project176;

import android.content.Intent;
import android.content.res.Resources;
//import android.net.wifi.hotspot2.pps.Home;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TabHost;

import java.lang.reflect.*;

public class Dashboard extends AppCompatActivity
{

    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

        private void getOverflowMenu() throws IllegalAccessException
        {
            try
            {
                ViewConfiguration configuration = ViewConfiguration.get(this);
                        java.lang.reflect.Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermenentMenuKey");
                if(menuKeyField != null)
                {
                    menuKeyField.setAccessible(true);
                    menuKeyField.setBoolean(configuration, false);
                }
                //Catching exceptions

        }
        catch (NoSuchFieldException e)
        {
                e.printStackTrace();
        }

          /**  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "This app was Developed by the codeAvengers", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }

        });
           */

    }


    //On click intent to view google maps
    public void onClickMaps(View view)
    {
        Intent intent1 = new Intent(Dashboard.this, GoogleMaps.class);
        startActivity(intent1);
    }

    //On click intent to request uber ride
    public void onClickUber(View view)
    {
        Intent intent1 = new Intent(Dashboard.this, Uber.class);
        startActivity(intent1);
    }

    //On click intent to view dashboard screen
    public void onClickHome(View view)
    {
        Intent intent1 = new Intent(Dashboard.this, Dashboard.class);
        startActivity(intent1);
    }

    //On click intent to view social media links
    public void onClickSocial(View view)
    {
        Intent intent1 = new Intent(Dashboard.this, SocialMedia.class);
        startActivity(intent1);
    }


   /** @Override
    public void onClick(View view)
    {
        //Resource objects to get drawables
        Resources resources = getResources();

        //The activity tab host
        TabHost tabHost = getTabHost();

        Intent intent1 = new Intent(Dashboard.this, SocialMedia.class);
        tabHost.addTab(tabHost.newTabSpec("tabItemSocial")
                .setIndicator("Social Media",resources.getDrawable(R.drawable.social_media))
                .setContent(intent1));

        Intent intent2 = new Intent(Dashboard.this, Dashboard.class);
        tabHost.addTab(tabHost.newTabSpec("tabItemHome")
                .setIndicator("Home",resources.getDrawable(R.drawable.home_icon))
                .setContent(intent2));

        Intent intent3 = new Intent(Dashboard.this, Dashboard.class);
        tabHost.addTab(tabHost.newTabSpec("tabItemUber")
                .setIndicator("Uber Request",resources.getDrawable(R.drawable.uber))
                .setContent(intent3));

        Intent intent4 = new Intent(Dashboard.this, Dashboard.class);
        tabHost.addTab(tabHost.newTabSpec("tabItemMaps")
                .setIndicator("Google Maps",resources.getDrawable(R.drawable.google_maps))
                .setContent(intent4));
    }
   */

    public TabHost getTabHost()

    {
        return tabHost;
    }

}
