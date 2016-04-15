package com.example.hp.materialtabs;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.materialtabs.DialogFragments.*;
import com.example.hp.materialtabs.FindLiftPAck.FindLiftActivity;
import com.example.hp.materialtabs.FindLiftPAck.FindLiftFragment;
import com.example.hp.materialtabs.LiftCreatePack.CreateLiftActivity;
import com.example.hp.materialtabs.LiftCreatePack.HomeCreateLiftFragment;
import com.example.hp.materialtabs.NavigationDrawerPackage.FragmentDrawer;

public class HomeActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    private FloatingActionButton findLiftBtn;
    private TextView month;
    private TextView day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );


        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        findLiftBtn=(FloatingActionButton) findViewById(R.id.search_Lift_button);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_container, new HomeCreateLiftFragment());
        fragmentTransaction.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void offerLiftBtn(View view){
        startActivity(new Intent(HomeActivity.this, CreateLiftActivity.class));
    }
    public void searchBtn(View view){
    startActivity(new Intent(HomeActivity.this, FindLiftActivity.class));
    }
    public void profileBtn(View v){
        startActivity(new Intent(HomeActivity.this,ProfileActivity.class));
    }
    public void logoutBtn(View v){
        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        DrawerLayout d= (DrawerLayout) findViewById(R.id.drawer_layout);
        View containerView= findViewById(R.id.fragment_navigation_drawer);
        d.closeDrawer(containerView);
    }
    public void closeDrawer(View v){
        DrawerLayout d= (DrawerLayout) findViewById(R.id.drawer_layout);
        View containerView= findViewById(R.id.fragment_navigation_drawer);
        d.closeDrawer(containerView);
    }
    public void gotoFindLiftBtn(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_container, new FindLiftFragment());
        fragmentTransaction.commit();
    }
    public void gotoOfferLiftBtn(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_container, new HomeCreateLiftFragment());
        fragmentTransaction.commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                findViewById(R.id.content_container).setVisibility(View.VISIBLE);
                fragment=null;
                break;
            case 1:
                fragment = new LiftOfferedFragment();
                findViewById(R.id.content_container).setVisibility(View.GONE);
                break;
            case 2:
                fragment = new  LiftTakenFragment();
                findViewById(R.id.content_container).setVisibility(View.GONE);
                break;
            case 3:
                fragment = new AlertFragment();
                findViewById(R.id.content_container).setVisibility(View.GONE);
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();
        }
        else{

        }
    }
    public void showCalender(View view){
        month= (TextView) findViewById(R.id.labelMonthFindLift);
        day= (TextView) findViewById(R.id.labelDateFindLift);

        DialogFragment newFragment = new com.example.hp.materialtabs.DialogFragments.DatePickerFragment(month,day,1);
        newFragment.show(getSupportFragmentManager(), "datePicker");

    }
}