package com.example.recyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Models.PhoneModel;
import com.example.recyclerview.R;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

public class PhoneAdapters extends RecyclerView.Adapter<PhoneAdapters.ViewHolder> {

    ArrayList<PhoneModel> list;
    Context context;

    // Creating Constructors
    public PhoneAdapters(ArrayList<PhoneModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PhoneModel model = list.get(position);

        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText((model.getText()));



        //On Click Listener on Recycler View

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "clicked on " +position, LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // ViewHolder is class name given by me
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);



        }
    }


}
