import com.example.mothupii_.project176.GoogleMap;

import java.io.IOException;

/**
 * Created by Mothupii_ on 2017-10-07.
 */

public class NearbyPlaces implements PlacesNearby {
    //Declaring variables
    String googlePlacesData;
    GoogleMap mMap;
    String url;

    @Override
    //Implemented methods of Async object tasks
    public String doInBackground(Object... objects)
    {
        mMap = (GoogleMap) objects[0];
        url =(String) objects [1];

        DownloadURL downloadURL = new DownloadURL();
        //Exceptional handling for the download URL
        try
        {
            googlePlacesData = downloadURL.readUrl(url);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return googlePlacesData;
    }
    //Selected method to override
    protected void onPostExecute(String strng)
    {
        //super.onPostExecute(strng);
    }
}
