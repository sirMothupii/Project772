import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Mothupii_ on 2017-10-07.
 */

public class DataParser
{
    private HashMap<String, String> getPlaces(JSONObject googlePlacesJson)
    {
        HashMap<String, String> googlePlacesMap = new HashMap<>();
        String placeName ="-NA";
        String vicinity ="-NA";
        String latitude ="";
        String longitude ="";
        String reference ="";

        //Exceptional handling for google places
        try {
            //boolean if statements
            if (!googlePlacesJson.isNull("name"))
            {
                placeName = googlePlacesJson.getString("name");
            }
            //if statement for google places vicinity
            if (!googlePlacesJson.isNull("vicinity"))
            {
                vicinity = (String) googlePlacesJson.get("vicinity");
            }

            latitude = (String) googlePlacesJson.getJSONObject("geometry").getJSONObject("location").get("lat");
            longitude = (String) googlePlacesJson.getJSONObject("geometry").getJSONObject("location").get("lng");

            reference = googlePlacesJson.getString("reference");


            googlePlacesMap.put("place name", placeName);
            googlePlacesMap.put("vicinity", vicinity);
            googlePlacesMap.put("lat", latitude);
            googlePlacesMap.put("lng", longitude);
            googlePlacesMap.put("reference", reference);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return googlePlacesMap;
    }
}
