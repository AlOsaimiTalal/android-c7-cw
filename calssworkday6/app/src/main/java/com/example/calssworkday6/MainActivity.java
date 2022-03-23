package com.example.calssworkday6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Items>  item = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items cheese = new Items("cheese",R.drawable.cheese,1.2);
        Items chocolate = new Items("chocolate",R.drawable.chocolate,0.5);
        Items coffee = new Items("coffee",R.drawable.coffee,3);
        Items donut = new Items("donut",R.drawable.donut,5);
        Items fries = new Items("fries",R.drawable.fries,4);
        Items honey = new Items("honey",R.drawable.honey,6);

        item.add(cheese);
        item.add(chocolate);
        item.add(coffee);
        item.add(donut);
        item.add(fries);
        item.add(honey);


        ItemAdapter itemadapter = new ItemAdapter(this,0,item);
        ListView listView1 = findViewById(R.id.listview);

        listView1.setAdapter(itemadapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Items currentItems = item.get(i);
                Intent detailsProduct = new Intent(MainActivity.this,Details.class);

                detailsProduct.putExtra("current product",currentItems);
                startActivity(detailsProduct);
            }
        });




    }









}