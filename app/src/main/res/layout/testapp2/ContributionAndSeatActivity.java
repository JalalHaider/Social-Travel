package layout.testapp2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class ContributionAndSeatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribution_and_seat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Contribution And Passenger");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void seatEdit(View v) {

        DialogFragment newFragment = new SimpleDialog(findViewById(R.id.seats), "seats");
        newFragment.show(getSupportFragmentManager(), "simpleDialog");
    }

    public void contribution(View v) {
        DialogFragment newFragment = new SimpleDialog(findViewById(R.id.contributionText), "contribution");
        newFragment.show(getSupportFragmentManager(), "simpleDialog");
    }
    private static boolean foodOption=false;
    private static boolean smookOption=false;

    public void changeRule(View v) {

        ImageView rule;
        if (v == findViewById(R.id.foodOption)) {
            rule = (ImageView) findViewById(R.id.foodOption);
            if(foodOption) {
                rule.setImageResource(R.drawable.no_food);
                foodOption=false;
            }
            else{
                rule.setImageResource(R.drawable.food);
                foodOption=true;
            }

        }
        if (v == findViewById(R.id.smokingOption)) {

            rule = (ImageView) findViewById(R.id.smokingOption);
            if(smookOption) {
                rule.setImageResource(R.drawable.no_smoking);
                smookOption=false;
            }
            else{
                rule.setImageResource(R.drawable.smoking);
                smookOption=true;
            }
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
        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);
    }
}
