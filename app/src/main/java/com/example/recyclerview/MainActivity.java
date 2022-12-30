package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.recyclerview.Adapters.PhoneAdapters;
import com.example.recyclerview.Models.PhoneModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<PhoneModel> list = new ArrayList<>();




        list.add(new PhoneModel(R.drawable.phone, "Redmi Pro"));
        list.add(new PhoneModel(R.drawable.oppo, "Oppo Pro"));
        list.add(new PhoneModel(R.drawable.oppof, "Oppof Pro"));
        list.add(new PhoneModel(R.drawable.phone, "Redmi Pro"));
        list.add(new PhoneModel(R.drawable.oppo, "Oppo Pro"));
        list.add(new PhoneModel(R.drawable.oppof, "Oppof Pro"));
        list.add(new PhoneModel(R.drawable.phone, "Redmi Pro"));
        list.add(new PhoneModel(R.drawable.phone, "Redmi Pro"));
        list.add(new PhoneModel(R.drawable.phone, "Redmi Pro"));


        PhoneAdapters adapters = new PhoneAdapters(list,this);
        recyclerView.setAdapter(adapters);

//          LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//          recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
//      recyclerView.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);


//        StaggeredGridLayoutManager staggered = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(staggered);

//        StaggeredGridLayoutManager staggered = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggered);




    }
}