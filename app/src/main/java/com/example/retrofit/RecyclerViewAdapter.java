package com.example.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Viewholder> {
    private ArrayList<Root> courseDataArrayList;
    private Context mcontext;
    public RecyclerViewAdapter(ArrayList<Root> courseDataArrayList, Context mcontext) {
        this.courseDataArrayList = courseDataArrayList;
        this.mcontext = mcontext;
    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mcontext).inflate(R.layout.recycle_view,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Root modal = courseDataArrayList.get(position);
        holder.login.setText(modal.getUser().getLogin());
        holder.repourl.setText(modal.getUser().getRepos_url());
        holder.state.setText(modal.getState());
        holder.id.setText(String.valueOf(modal.getUser().getId()));


    }

    @Override
    public int getItemCount() {
        return courseDataArrayList.size();
    }

    public  class Viewholder extends RecyclerView.ViewHolder{
        TextView id, login,repourl, state;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.id);
            login=itemView.findViewById(R.id.login);
            repourl=itemView.findViewById(R.id.repourl);
            state=itemView.findViewById(R.id.State);
        }
    }

}
