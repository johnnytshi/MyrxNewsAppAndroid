package com.example.geetion.rxnewsappandroid.CollageNews;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.geetion.rxnewsappandroid.R;

import java.util.ArrayList;

/**
 * Created by Geetion on 16/1/29.
 */
public class CollageAdapter extends RecyclerView.Adapter<CollageAdapter.MyViewHolder> {

    ArrayList<CollageItem> list = new ArrayList<>();

    public CollageAdapter(ArrayList<CollageItem> myList){
            list = myList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.collage_viewholder, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        CollageItem item = list.get(position);

        holder.title.setText(item.title);
        holder.info.setText(item.info);
        holder.click.setText(String.valueOf(item.click));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView title;
        TextView info;
        TextView click;

        public MyViewHolder(View view)
        {
            super(view);

            click = (TextView)view.findViewById(R.id.click);
            title = (TextView)view.findViewById(R.id.title);
            info = (TextView)view.findViewById(R.id.info);
        }
    }
}
