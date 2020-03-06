package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import com.example.gridlayout.adapters.ShopAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ShopData>shopDataList;
    ShopData shopData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);


        GridLayoutManager gridLayoutManager=new GridLayoutManager(MainActivity.this,2);
        recyclerView.setLayoutManager(gridLayoutManager);


        shopDataList=new ArrayList<>();

        shopData=new ShopData(R.drawable.samsung_note7,"Zaw Ti Ka","Samsung Note-7",3,500000,20,"new");
        shopDataList.add(shopData);

        shopData=new ShopData(R.drawable.s10,"Mobile One","Samsung S10",5,1400000,30,"old");
        shopDataList.add(shopData);

        shopData=new ShopData(R.drawable.s9,"Hong Kong","Samsung Galaxy S9",4,700000,20,"new");
        shopDataList.add(shopData);

        shopData=new ShopData(R.drawable.note9,"Mobile Like","Samsung Note-9",5,1000000,20,"old");
        shopDataList.add(shopData);

        ShopAdapter shopAdapter=new ShopAdapter(MainActivity.this,shopDataList);
        recyclerView.setAdapter(shopAdapter);
    }
}
