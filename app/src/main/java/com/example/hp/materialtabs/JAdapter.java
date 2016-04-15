package com.example.hp.materialtabs;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by Jalal Haider on 4/3/2016.
 */
public class JAdapter extends RecyclerView.Adapter<JAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private List<MyInfo> list= Collections.emptyList();
    public JAdapter(Context context, List<MyInfo> data){
        inflater= LayoutInflater.from(context);
        list=data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.recycle_view_row, parent, false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyInfo CurrentInfo=list.get(position);
        holder.text1.setText(CurrentInfo.info1);
        holder.text2.setText(CurrentInfo.info2);
        holder.imageNode.setImageResource(CurrentInfo.nodeIc);
        holder.convoIc.setImageResource(CurrentInfo.convoIc);

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView text1,text2;
        ImageView imageNode;
        ImageView convoIc;
        public MyViewHolder(View itemView) {
            super(itemView);
            text1= (TextView) itemView.findViewById(R.id.text1);
            text2= (TextView) itemView.findViewById(R.id.text2);
            imageNode= (ImageView) itemView.findViewById(R.id.node);
            convoIc= (ImageView) itemView.findViewById(R.id.convo);
            text1.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), getPosition()+" Disabled",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
