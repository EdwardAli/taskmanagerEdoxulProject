package com.edoali.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //CardView goalCard;
    Button goal,activity,fitness,reminder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        goal=findViewById(R.id.toGoal);
        activity=findViewById(R.id.toActivity);
        fitness=findViewById(R.id.toFitness);
        reminder=findViewById(R.id.toReminder);
        //goalCard=findViewById(R.id.Card1);

        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GoalActivity.class);
                startActivity(intent);
            }
        });
    }
}