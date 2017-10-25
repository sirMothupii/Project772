package com.example.mothupii_.project176;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Overview extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
    }

    //On click intent to view google maps
    public void onClickMaps(View view)
    {
        Intent intent1 = new Intent(Overview.this, GoogleMaps.class);
        startActivity(intent1);
    }

    //On click intent to request uber ride
    public void onClickUber(View view)
    {
        Intent intent1 = new Intent(Overview.this, Uber.class);
        startActivity(intent1);
    }

    //On click intent to view dashboard screen
    public void onClickHome(View view)
    {
        Intent intent1 = new Intent(Overview.this, Dashboard.class);
        startActivity(intent1);
    }

    //On click intent to view social media links
    public void onClickSocial(View view)
    {
        Intent intent1 = new Intent(Overview.this, SocialMedia.class);
        startActivity(intent1);
    }


    /** @Override
    public void onClick(View view)
    {
    onClickListener for the tab items
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

}
