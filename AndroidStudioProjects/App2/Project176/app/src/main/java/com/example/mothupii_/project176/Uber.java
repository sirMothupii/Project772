package com.example.mothupii_.project176;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Uber extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uber);

       /** case  R.id.tabItemUber:
        {
        Google maps intent
            String Uri ="geo "+newPlace.getLatitude()+","+newPlace.getLongitude() +
                    "?q="+newPlace.getLatitude()+","+newPlace.getLongitude();
            startActivity(new Intent(Intent.ACTION_VIEW, android.net.Uri.parse(uri)));
        }
        */
       //Uber request intent with
        String url = "uber://?action=setPickup&pickup=94043";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
