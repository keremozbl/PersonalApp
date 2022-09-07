package com.kerem.personalapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String descriptation[];
    int images[];
    Context context;
    RecyclerView recyclerView;

    public MyAdapter(Context ct,int img[],String tools[]){

        context=ct;
        images=img;
        descriptation= tools;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_layout,parent,false);
        return new MyViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.myImage.setImageResource(images[position]);
        holder.myText.setText(descriptation[position]);

        holder.myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (descriptation[position] == descriptation[0] ){

                    Intent intent0 = new Intent(context, User_Page.class);
                    context.startActivity(intent0);
                }
                else if(descriptation[position] == descriptation[1] ){

                    Intent intent1 = new Intent(context, Friends_Page.class);
                    context.startActivity(intent1);
                }
                else if (descriptation[position] == descriptation[2] ){

                    Intent intent2 = new Intent(context, Gym_Page.class);
                    context.startActivity(intent2);
                }
                else if (descriptation[position] == descriptation[3] ){

                    Intent intent3 = new Intent(context, Stopwatch_Page.class);
                    context.startActivity(intent3);
                }
                else if (descriptation[position] == descriptation[4] ){

                    Intent intent4 = new Intent(context, Note_Page.class);
                    context.startActivity(intent4);
                }
                else {
                    Intent intent5 = new Intent(context, Settings_Page.class);
                    context.startActivity(intent5);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView myImage;
        ConstraintLayout mainLayout;
        TextView myText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myImage=itemView.findViewById(R.id.imageView);
            mainLayout=itemView.findViewById(R.id.linearLayout);
            myText=itemView.findViewById(R.id.descraption_txt);
        }

    }

}
