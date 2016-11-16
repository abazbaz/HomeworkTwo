package com.example.adrian.homeworkonetwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText UserNameInput;
    EditText PasswInput;
    Integer Butt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserNameInput=(EditText) findViewById(R.id.UserNameInput);
        PasswInput=(EditText) findViewById(R.id.PasswInput);
        setupButton();
    }



    // Declare variables for the Widgets
//    private EditText UserNameInput;

    //-----------------------------------------------
    //-----------   LOGIN BUTTON  -------------------
    //-----------------------------------------------

    private void setupButton() {
        // 1. Create a reference to the button
        Button messageButton = (Button) findViewById(R.id.button);

        // 2. Set the click listener to run my code

        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Setup User Name Input Read
                UserNameInput = (EditText) findViewById(R.id.UserNameInput);
                PasswInput=(EditText) findViewById(R.id.PasswInput);

                //A way to output into a logger without the emulator
                Log.i("Demo Button","You clicked the button");

                // Check if Username and Password Match
                if (((UserNameInput.getText().toString()).equals("user")) && (PasswInput.getText().toString().equals("1234"))) {


                    // If the Password is correct the Button will send you to either Settings Screen or

                    if (Butt.equals(1)) {
                        Intent newPage = new Intent(MainActivity.this, SettingsActivity.class);
                        startActivity(newPage);
                    }

                    if (Butt.equals(2)) {
                        Intent newPage = new Intent(MainActivity.this, SettingsActivity.class);
                        startActivity(newPage);
                    }

                    // If the Password is correct it wil also display a toast
                    Toast toast = Toast.makeText(MainActivity.this, "Welcome!" , Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, -100);
                    toast.show();

                    // If the Password is correct it wil also display a toast
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Access Denied" , Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, 450);
                    toast.show();

                }
            }
        });

    }   //LOG IN BUTTON METHOD ENDS


    //-----------------------------------------------
    //------------  RADIO BUTTON  -------------------
    //-----------------------------------------------

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonSettings:
                if (checked)
                    Butt=1;
                    break;
            case R.id.radioButtonProfile:
                if (checked)
                    Butt=2;
                    // Ninjas rule
                    break;
        }
    }



    }

//    private EditText PasswordUser;
//
//    public void buttoOnClick(View v);

