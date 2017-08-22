import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Mothupii_ on 2017-08-20.
 */

public class Login {
    //Login on click functionality
//declarations Credentioals
    Button btnLogin;
    EditText editTxtName;
    EditText editTxtPassworsd;
    EditText  txtRegLink;

    //string literals;
    String EditText;

    EditText username;
    EditText password;

    public Login() {
        String editTxtUsername;
    }

    public void login (View view){
        if( username.getText().toString().equals("user")&&password.getText().toString().equals("admin"))
        {
            //correct password
        }
        else
        {
            //incorrect password
        }
        //password attempts
        int counter =3;
        counter--;

        if(counter==0){
            //disable button
        }

        }
}


