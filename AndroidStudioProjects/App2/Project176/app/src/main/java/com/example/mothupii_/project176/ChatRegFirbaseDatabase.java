package com.example.mothupii_.project176;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.mothupii_.project176.R.id.editTxtRegChat;

public class ChatRegFirbaseDatabase extends AppCompatActivity
{
    Button iBtnSubmitReg;
    EditText iEditTxtUserName;
    EditText iEditTxtGender;
    EditText iEditTxtDOB;
    EditText iEditTxtRegChat;
    EditText iEditTxtLocation;

    //mRoot reference method to get instance of firebase database
    /**this class creates a root ref to the firebase JSON tree*/
    DatabaseReference iRootRef = FirebaseDatabase.getInstance().getReference();
    private Object iRootrRef;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_reg_firbase_database);

        //GUI elements for iSocialize chat Registration
        iEditTxtUserName =( EditText)findViewById(R.id.editTxtUserName);
        iEditTxtGender =( EditText)findViewById(R.id.editTxtGender);
        iEditTxtDOB =( EditText)findViewById(R.id.editTxtDOB);
        iEditTxtRegChat =( EditText)findViewById(editTxtRegChat);
        iEditTxtLocation =( EditText)findViewById(R.id.editTxtLocation);
        iBtnSubmitReg = (Button) findViewById(R.id.btnSubmitReg);


    }

    @Override
    protected void onStart()
    {
        super.onStart();

        //Database reference
        String chatRegisterref = iRootrRef.toString();
    }

    //OnClick button to Confirm Registrations for the chat Profile
    public void onClickChatReg(View view)
    {
        Snackbar.make(view, "Registration Successfull", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    //Click button to access the dashboard screen
    public void onClickHomeActivity(View view)
    {
        Intent intent1 = new Intent(this, Dashboard.class);
        startActivity(intent1);
    }

   /** //onClick listener to save the user data into the online firebase storage
    iBtnSubmitReg.setOnClickListener(new.onClickListener()
{
    @Override
            public void onClick(View view)
    {
        iBtnSubmitReg.setValue("Registration successful")
    }
});*/

}
