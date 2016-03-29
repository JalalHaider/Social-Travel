package com.example.hp.materialtabs;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class SignUp extends AppCompatActivity {
    EditText firstName,lastName,emailId,contact,regs;
    RadioButton male,female;
    Button btn;
    View focusView;
    private View containerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        firstName= (EditText) findViewById(R.id.fname);
        lastName = (EditText) findViewById(R.id.lname);
        emailId= (EditText) findViewById(R.id.email);
        contact= (EditText) findViewById(R.id.contact);
        regs= (EditText) findViewById(R.id.registrationCode);
        male= (RadioButton) findViewById(R.id.maleBtn);
        female= (RadioButton) findViewById(R.id.femaleBtn);
        containerLayout=findViewById(R.id.container);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.closed);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        containerLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    emailId.setError(null);
                    firstName.setError(null);
                    regs.setError(null);
                    // Do what you want
                    return true;
                }
                return false;
            }
        });
        btn= (Button) findViewById(R.id.signUpBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attempLogin();
            }
        });

        getSupportActionBar().setDisplayShowTitleEnabled(true);


    }
    public void attempLogin(){

        emailId.setError(null);
        firstName.setError(null);
        regs.setError(null);
        boolean cancel = false;
        if (TextUtils.isEmpty(firstName.getText().toString())) {
            firstName.setError("");
            focusView = firstName;
            cancel=true;
        }
        if (isRegValid(regs.getText().toString())) {
            regs.setError("");
            focusView = regs;
            cancel=true;
        }

        // Check for a valid email address.
        if (TextUtils.isEmpty(emailId.getText().toString())) {
            emailId.setError("");
            focusView = emailId;
            cancel = true;
        } else if (!isEmailValid(emailId.getText().toString())) {
            emailId.setError("");
            focusView = emailId;
            cancel = true;
        }
        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        }
        else {

            FragmentManager manager = getFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            Verification frag = new Verification();
            transaction.add(R.id.signUplayout, frag, "frag");
            transaction.commit();
        }
    }
    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }
    private boolean isRegValid(String reg) {
        //TODO: Replace this with your own logic
        return reg.length()>=4 && reg.length()<=7;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sign_up_menu, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.notes) {
            return true;
        }
        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
