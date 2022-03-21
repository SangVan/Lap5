package com.example.lap5;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoDountActivity extends AppCompatActivity {
    TextView tvDountName;
    TextView tvDountDes;
    TextView tvDountPrice;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_info_donut);
        tvDountName = findViewById(R.id.tvDountName);
        tvDountDes = findViewById(R.id.tvDountDes);
        tvDountPrice = findViewById(R.id.tvDountPrice);
        imageView = findViewById(R.id.imageView);

        String resourceId = getIntent().getStringExtra("resourceId");
        String name = getIntent().getStringExtra("name");
        String des = getIntent().getStringExtra("des");
        String price = getIntent().getStringExtra("price");

        imageView.setImageResource(Integer.valueOf(resourceId));
        tvDountName.setText(name);tvDountDes.setText(des);tvDountPrice.setText(price);
    }


}
