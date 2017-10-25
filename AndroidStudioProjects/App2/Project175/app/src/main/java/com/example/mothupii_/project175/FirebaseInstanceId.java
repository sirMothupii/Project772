package com.example.mothupii_.project175;

import android.support.v4.media.session.MediaSessionCompat;

/**
 * Created by Mothupii_ on 2017-10-25.
 */

public class FirebaseInstanceId
{

    private static MediaSessionCompat.Token instance;

    public static MediaSessionCompat.Token getInstance()
    {
        return instance;
    }
}
