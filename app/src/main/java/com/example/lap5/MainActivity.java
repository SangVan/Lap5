package com.example.lap5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Dount> listDonut;
    private ListView listView;
    private ListAdapter listAdapter;
    private int positionSelect = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lvDonut);
        loadDataDonut();

        listAdapter = new ArrayAdapter<Dount>(this,0,listDonut){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.dount_item,null);

                TextView tvDonutName = convertView.findViewById(R.id.tvDountName);
                TextView tvDonutDes = convertView.findViewById(R.id.tvDountDes);
                TextView tvDonutPrice = convertView.findViewById(R.id.tvDountPrice);
                ImageView lvDonut = convertView.findViewById(R.id.imageView);
                Dount donut =  listDonut.get(position);
                tvDonutName.setText(donut.getName());
                tvDonutDes.setText(donut.getDescription());
                tvDonutPrice.setText("$ "+donut.getPrice()+".00");
                lvDonut.setImageResource(donut.getResourceId());

                return convertView;
            }
        };
        listView.setAdapter(listAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                showDonut(position);
//            }
//        });
    }

//    private void showDonut(int position) {
//        Donut donut = listDonut.get(position);
//
//        Intent i = new Intent(this,InfoDonutActivity.class);
//        i.putExtra("resourceId",""+donut.getResourceId());
//        i.putExtra("name",donut.getName());
//        i.putExtra("des",donut.getDescription());
//        i.putExtra("price","$ "+donut.getPrice()+".00");
//        startActivity(i);
//    }

    private void loadDataDonut() {
        listDonut = new ArrayList<>();
        listDonut.add(new Dount(R.drawable.donut_yellow_1,"Tasty Donut","Spicy tasty donut family",100));
        listDonut.add(new Dount(R.drawable.tasty_donut_1,"Pink Donut","Spicy tasty donut family",200));
        listDonut.add(new Dount(R.drawable.donut_red_1,"Floating Donut","Spicy tasty donut family",300));
        listDonut.add(new Dount(R.drawable.green_donut_1,"Tasty Donut","Spicy tasty donut family",400));
    }
}