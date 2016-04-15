package layout.testapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView month,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Create Your Lift");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,ContributionAndSeatActivity.class));
       /*         Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
       */
            }
        });
        /*byDefaultFragment*/
        android.support.v4.app.FragmentManager frag=getSupportFragmentManager();
        FragmentTransaction transaction = frag.beginTransaction();
        transaction.replace(R.id.fragment,new MondayFragment());
        transaction.commit();
    }


    public void calender(View v) {
        month= (TextView) findViewById(R.id.month);
        day= (TextView) findViewById(R.id.day);

        DialogFragment newFragment = new DatePickerFragment(month,day,1);
        newFragment.show(getSupportFragmentManager(), "datePicker");

    }

    public void liftExpiry(View v) {
        TextView lifte= (TextView) findViewById(R.id.expiry_date);
        DialogFragment newFragment = new DatePickerFragment(lifte,2);
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void showDialog(View v) {

        DialogFragment newFragment = new SimpleDialog(findViewById(R.id.comment_des),"comment");
        newFragment.show(getSupportFragmentManager(), "simpleDialog");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void daysBtn(View view){

        ImageView mon = (ImageView) findViewById(R.id.mondayBtn);
        mon.setImageResource(R.drawable.mon);

        ImageView tue = (ImageView) findViewById(R.id.tuesdayBtn);
        tue.setImageResource(R.drawable.tue);

        ImageView wed = (ImageView) findViewById(R.id.wednesdayBtn);
        wed.setImageResource(R.drawable.wed);

        ImageView thu = (ImageView) findViewById(R.id.thursdayBtn);
        thu.setImageResource(R.drawable.thu);

        ImageView fri = (ImageView) findViewById(R.id.fridayBtn);
        fri.setImageResource(R.drawable.fri);

        ImageView sat = (ImageView) findViewById(R.id.saturdayBtn);
        sat.setImageResource(R.drawable.sat);

        ImageView sun = (ImageView) findViewById(R.id.sundayBtn);
        sun.setImageResource(R.drawable.sun);

        if(view == findViewById(R.id.mondayBtn)){
            mon.setImageResource(R.drawable.filled_mon);
            android.support.v4.app.FragmentManager frag=getSupportFragmentManager();
            FragmentTransaction transaction = frag.beginTransaction();
            transaction.replace(R.id.fragment,new MondayFragment());
            transaction.commit();

        }
        if(view == findViewById(R.id.tuesdayBtn)){
            tue.setImageResource(R.drawable.filled_tue);
            android.support.v4.app.FragmentManager frag=getSupportFragmentManager();
            FragmentTransaction transaction = frag.beginTransaction();
            transaction.replace(R.id.fragment,new TueasdayFragment());
            transaction.commit();
        }
        if(view == findViewById(R.id.wednesdayBtn)){
            wed.setImageResource(R.drawable.filled_wed);
            android.support.v4.app.FragmentManager frag=getSupportFragmentManager();
            FragmentTransaction transaction = frag.beginTransaction();
            transaction.replace(R.id.fragment,new WednesdayFragment());
            transaction.commit();
        }
        if(view == findViewById(R.id.thursdayBtn)){
            thu.setImageResource(R.drawable.filled_thu);
            android.support.v4.app.FragmentManager frag=getSupportFragmentManager();
            FragmentTransaction transaction = frag.beginTransaction();
            transaction.replace(R.id.fragment,new ThursdayFragment());
            transaction.commit();
        }
        if(view == findViewById(R.id.fridayBtn)){
            fri.setImageResource(R.drawable.filled_fri);
            android.support.v4.app.FragmentManager frag=getSupportFragmentManager();
            FragmentTransaction transaction = frag.beginTransaction();
            transaction.replace(R.id.fragment,new FridayFragment());
            transaction.commit();
        }
        if(view == findViewById(R.id.saturdayBtn)){
            sat.setImageResource(R.drawable.filled_sat);
            android.support.v4.app.FragmentManager frag=getSupportFragmentManager();
            FragmentTransaction transaction = frag.beginTransaction();
            transaction.replace(R.id.fragment,new SaturdayFragment());
            transaction.commit();
        }
        if(view == findViewById(R.id.sundayBtn)){
            sun.setImageResource(R.drawable.filled_sun);
            android.support.v4.app.FragmentManager frag=getSupportFragmentManager();
            FragmentTransaction transaction = frag.beginTransaction();
            transaction.replace(R.id.fragment,new SundayFragment());
            transaction.commit();
        }
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
        if(id==android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }
}
