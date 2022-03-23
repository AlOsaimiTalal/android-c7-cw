package com.example.calssworkday6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Items> {
    List<Items> item;
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        item = objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent,false);

        Items currentItems = item.get(position);
        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemPrice);
        ImageView itemImg = view.findViewById(R.id.itemImage);
        ImageView delImg = view.findViewById(R.id.imageView2);


        itemName.setText(currentItems.getItemName());
        itemPrice.setText(currentItems.getItemPrice()+"");

        itemImg.setImageResource(currentItems.getItemImage());

        delImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.remove(position);
                notifyDataSetChanged();
            }
        });

        return view;





    }
}
