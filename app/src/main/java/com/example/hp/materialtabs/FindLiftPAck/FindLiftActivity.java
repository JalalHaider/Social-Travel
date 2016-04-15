package com.example.hp.materialtabs.FindLiftPAck;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.hp.materialtabs.R;

import java.util.ArrayList;
import java.util.List;

public class FindLiftActivity extends AppCompatActivity {


    private RecyclerView recycleView;
    private AdapterFindLift adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_lift);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Find Your Lift");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recycleView = (RecyclerView)findViewById(R.id.findLiftList);
        adapter = new AdapterFindLift(this, getData());
        recycleView.setLayoutManager(new LinearLayoutManager(this));

        recycleView.setAdapter(adapter);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void calender(View view){
        Snackbar.make(view, "Calender is diabled", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
    public static List<FindLiftInfo> getData() {
        List<FindLiftInfo> data = new ArrayList<FindLiftInfo>();
        int nodeIc = R.drawable.user_ic_male;

        String[][] info = {{"jalal","Johar, Karachi", "Iqra University Defence, Karachi","9:00","15:00","Rs.100"},
                {"Umer","PIB, Karachi","Johar, Karachi","9:00","15:00","Rs.100"},
                {"Narmeen","Iqra University"," Defence, Karachi","9:00","15:00","Rs.100"},
                {"Urooj","Lyari, Karachi", "Askari VI","9:00","15:00","Rs.100"}};

        for (int i = 0; i < 4; i++) {
            FindLiftInfo fo = new FindLiftInfo();
            fo.name = info[i][0];
            fo.to = info[i][1];
            fo.from = info[i][2];
            fo.leavetime=info[i][3];
            fo.returntime=info[i][4];
            fo.cost=info[i][5];
            fo.image=nodeIc;
            data.add(fo);
        }
        return data;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
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
