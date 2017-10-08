package com.example.mothupii_.opsc7311_assignment2_15012046;



import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import static android.R.attr.id;

public class Question2 extends AppCompatActivity {
    DatabaseHelper theDb;

    //Defining the variable for textLables
    EditText editEmployeeID, editFullNames, editProfession, editSalary;
    Button btnAddData;
    Button btnView;
    Button btnUpdate;
    Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout.layout.activity_question2);

        theDb = new DatabaseHelper(this);

        //casting the defined variables on to create method
        editEmployeeID = (EditText) findViewById(R.id.txt_EmpID);
        editFullNames = (EditText) findViewById(R.id.txt_FullNames);
        editProfession = (EditText) findViewById(R.id.txt_Profession);
        editSalary = (EditText) findViewById(R.id.txt_Salary);
        btnAddData = (Button) findViewById(R.id.btnAddData);
        btnView = (Button) findViewById(R.id.btnView);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);

        //Declaring variable methods
        String AddData;
        String view;
        String UpdateDatabase;

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

            public void Delete() {
                btnDelete.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Integer deletedRows = theDb.deleteData(editEmployeeID.getText().toString());
                                if (deletedRows > 0)
                                    Toast.makeText(Question2.this, "Data Is Deleted", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(Question2.this, "Data is not Deleted", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
            }

            public void UpdateDatabase()
            {
                btnUpdate.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                boolean isUpdate = theDb.updateData(editEmployeeID.getText().toString(), editFullNames.getText().toString(), editProfession.getText().toString(), editSalary.getText().toString() );
                                if (isUpdate == true)
                                {
                                    //toast class to display success message
                                    if (isUpdate == true)
                                        Toast.makeText(Question2.this, "Data Is Update", Toast.LENGTH_SHORT).show();
                                    else
                                        Toast.makeText(Question2.this, "Data is not Updated", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                );
            }

            public void AddData() {
                btnAddData.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                boolean isInserted = theDb.insertData(editFullNames.getText().toString(),
                                        editProfession.getText().toString(),
                                        editSalary.getText().toString(Salary));
                                if (isInserted == true)
                                    //toast class to display success message
                                    Toast.makeText(Question2.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(Question2.this, "Data is not inserted", Toast.LENGTH_SHORT).show();

                            }
                        }
                );
            }

                                   public void view()
                                   {
                                       btnView.setOnClickListener(
                                               new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       Cursor res = theDb.getData();
                                                       if (res.getCount() == 0) {
                                                           //show message
                                                           showMessage("Error", "No data found");
                                                           return;
                                                       }
                                                       //instance of string buffer
                                                       StringBuffer buffer = new StringBuffer();
                                                       while (res.moveToNext()) {
                                                           buffer.append("Employee ID:" + res.getString(0) + "\n");
                                                           buffer.append("Full Names:" + res.getString(1) + "\n");
                                                           buffer.append("Profession:" + res.getString(2) + "\n");
                                                           buffer.append("Salary:" + res.getString(3) + "\n\n");
                                                       }

                                                       //show all the data
                                                       showMessage("Data", buffer.toString());
                                                   }
                                               }
                                       );

                                   }

                                   public void showMessage(String title, String Message) {
                                       AlertDialog.Builder builder = new AlertDialog.Builder(Question2.this);
                                       builder.setCancelable(true);
                                       builder.setTitle(title);
                                       builder.setMessage(Message);
                                       builder.show();
                                   }
                               }
        );
    }


    @Override
                                   public boolean onCreateOptionsMenu(Menu menu)
                                   {
                                       // Inflate the menu; this adds items to the action bar if it is present.
                                       getMenuInflater().inflate(R.menu.menu_question1, menu);
                                       return true;
                                   }

                                   @Override
                                   public boolean onOptionsItemSelected(MenuItem item)
                                   {
                                       // Handle action bar item clicks here. The action bar will
                                       // automatically handle clicks on the Home/Up button, so long
                                       // as you specify a parent activity in AndroidManifest.xml.
                                       int id = item.getItemId();

                                       //noinspection SimplifiableIfStatement
                                       if (id == R.id.action_settings)
                                       {
                                           return true;
                                       }

                                       return super.onOptionsItemSelected(item);
                                   }
                               }


