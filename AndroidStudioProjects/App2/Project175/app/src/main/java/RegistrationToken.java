import android.util.Log;

import com.example.mothupii_.project175.FirebaseInstanceId;
import com.example.mothupii_.project175.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by Mothupii_ on 2017-10-25.
 */

public class RegistrationToken extends FirebaseInstanceIdService
{
    //@Override
    //Accessing Registration Token
    /**You can access the token's value by creating a new class which extends FirebaseInstanceIdService .
     * In that class, call getToken within onTokenRefresh ,
     * and log the value as shown*/

    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = (String) FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken)
    {

    }
}
