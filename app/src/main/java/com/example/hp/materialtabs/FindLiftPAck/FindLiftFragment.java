package com.example.hp.materialtabs.FindLiftPAck;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.materialtabs.DialogFragments.*;
import com.example.hp.materialtabs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FindLiftFragment extends Fragment {
    private EditText whereFromText;
    private EditText whereToText;
    private FloatingActionButton goBtn;
    private TextView month;
    private TextView day;

    public FindLiftFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_find_lift, container, false);
        whereFromText = (EditText) view.findViewById(R.id.wherefrom);
        whereToText = (EditText) view.findViewById(R.id.whereTo);
        goBtn= (FloatingActionButton) view.findViewById(R.id.search_Lift_button);

        return view;
    }

    public void showCalender(View v){
        month= (TextView) v.findViewById(R.id.labelMonthFindLift);
        day= (TextView) v.findViewById(R.id.labelDateFindLift);
        DialogFragment newFragment = new com.example.hp.materialtabs.DialogFragments.DatePickerFragment(month,day,1);
        newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");
    }



}
