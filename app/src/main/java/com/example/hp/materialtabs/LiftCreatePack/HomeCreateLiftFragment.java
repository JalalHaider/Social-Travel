package com.example.hp.materialtabs.LiftCreatePack;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hp.materialtabs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeCreateLiftFragment extends Fragment {


    public HomeCreateLiftFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_create_lift, container, false);
    }

}
