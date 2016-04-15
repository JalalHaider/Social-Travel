package com.example.hp.materialtabs.FindLiftPAck;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.materialtabs.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by Jalal Haider on 4/3/2016.
 */
public class AdapterFindLift extends RecyclerView.Adapter<AdapterFindLift.MyViewHolder> {

    private LayoutInflater inflater;
    private List<FindLiftInfo> list= Collections.emptyList();
    public AdapterFindLift(Context context, List<FindLiftInfo> data){
        inflater= LayoutInflater.from(context);
        list=data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.row_layout_find_lift_list, parent, false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        FindLiftInfo CurrentInfo=list.get(position);
        holder.profileImageView.setImageResource(CurrentInfo.image);
        holder.nameText.setText(CurrentInfo.name);
        holder.leavetimeText.setText(CurrentInfo.leavetime);
        holder.returntimeText.setText(CurrentInfo.returntime);
        holder.costText.setText(CurrentInfo.cost);
        holder.toText.setText(CurrentInfo.to);
        holder.fromText.setText(CurrentInfo.from);

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView nameText,leavetimeText,returntimeText,toText,fromText,costText;
        ImageView profileImageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            profileImageView= (ImageView) itemView.findViewById(R.id.profileImage);
            nameText= (TextView) itemView.findViewById(R.id.name);
            toText= (TextView) itemView.findViewById(R.id.to);
            fromText= (TextView) itemView.findViewById(R.id.from);
            costText= (TextView) itemView.findViewById(R.id.cost);
            leavetimeText= (TextView) itemView.findViewById(R.id.leaveTime);
            returntimeText= (TextView) itemView.findViewById(R.id.returnTime);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), getPosition()+" Disabled",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
