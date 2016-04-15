package com.example.hp.materialtabs.DialogFragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.hp.materialtabs.R;

/**
 * Created by hp on 4/6/2016.
 */
public class SimpleDialog extends DialogFragment {

    String forView;
    private View v;
    private TextView view;
    public SimpleDialog(View v,String forView) {
        Log.e("hello","ariive");
        Log.e(v.toString(),"View constructor");
        this.view= (TextView) v;
        this.forView=forView;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder build=new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        v=inflater.inflate(R.layout.textv, null);
        final TextView text= (TextView) v.findViewById(R.id.user_comment);

        if(forView=="comment"){
            build.setTitle("Comment");
            text.setHint("Enter Comment");
        }
        else if(forView=="contribution"){
            build.setTitle("Contribution");
            text.setHint("Contribution per Passenger");
        }
        else{
            build.setTitle("Seats");
            text.setHint("no. of available Seats");
        }
               build.setPositiveButton("fire", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       // FIRE ZE MISSILES!
                       if(forView=="contribution"){
                           view.setText("Rs. "+text.getText().toString());
                       }
                       else{
                           view.setText(text.getText().toString());
                       }
                   }
               }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        }).setView(v);
        // Create the AlertDialog object and return it
        return build.create();}
}
