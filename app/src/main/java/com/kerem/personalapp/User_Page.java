package com.kerem.personalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class User_Page extends AppCompatActivity {

    EditText surname_edit,name_edit;
    String userName;
    Button saveBtn;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        name_edit=(EditText) findViewById(R.id.name_et);
        surname_edit=(EditText) findViewById(R.id.surname_et);
        saveBtn = (Button) findViewById(R.id.save_btn);




        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent intent =new Intent(User_Page.this,MainActivity.class);
            intent.putExtra("userName_data",name_edit.getText().toString()+" "+surname_edit.getText().toString());
            startActivity(intent);
            }


        });




    }
}