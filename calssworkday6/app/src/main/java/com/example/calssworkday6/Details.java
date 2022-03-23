package com.example.calssworkday6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle Delivero = getIntent().getExtras();
        ImageView image = findViewById(R.id.imageView);
        TextView ship = findViewById(R.id.textView);

        Items currentItems = (Items) Delivero.getSerializable("current product");

        image.setImageResource(currentItems.getItemImage());
        ship.setText(currentItems.getItemName());

    }
}