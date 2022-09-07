package com.kerem.personalapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    String tools[];
    TextView nameMain,tittle;
    String nameData;

    int images[]={R.drawable.user,R.drawable.friends,R.drawable.gym_,R.drawable.stopwatch_,R.drawable.writing,R.drawable.setting};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameMain = (TextView) findViewById(R.id.userName_txt);

        recyclerView = findViewById(R.id.recycleView);


        tools = getResources().getStringArray(R.array.descriptation);

        MyAdapter myAdapter = new MyAdapter(this, images, tools);
        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new GridLayoutManager(context, 2, LinearLayoutManager.VERTICAL, false));

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nameData = extras.getString("userName_data");

            nameMain.setText(nameData);


        }

    }

}

