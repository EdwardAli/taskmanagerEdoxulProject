package com.edoali.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GoalActivity extends AppCompatActivity {
    RecyclerView goalView;
    GoalAdapter goalAdapter;
    ImageView addGoalbtn,backImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

        goalView=findViewById(R.id.goalRecyler_view);
        goalAdapter=new GoalAdapter();
        goalView.setAdapter(goalAdapter);
        addGoalbtn =findViewById(R.id.floating_add);
        backImage=findViewById(R.id.backImage);

        addGoalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GoalActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });

       backImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(GoalActivity.this,MainActivity.class);
               startActivity(intent);
           }
       });
    }
}