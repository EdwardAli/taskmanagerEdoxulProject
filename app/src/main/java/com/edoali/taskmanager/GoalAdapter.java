package com.edoali.taskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class GoalAdapter extends RecyclerView.Adapter<GoalAdapter.ViewHolder> {

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
    View view =layoutInflater.inflate(R.layout.single_goal,parent,false);
    ViewHolder viewHolder=new ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 13;
  }

  class  ViewHolder extends RecyclerView.ViewHolder{
ImageView delete,edit,alarm;
TextView element;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);
        delete=itemView.findViewById(R.id.delete_1);
        edit=itemView.findViewById(R.id.edit_1);
        alarm=itemView.findViewById(R.id.alam_1);
        element=itemView.findViewById(R.id.txtListElement);



    }
  }
}