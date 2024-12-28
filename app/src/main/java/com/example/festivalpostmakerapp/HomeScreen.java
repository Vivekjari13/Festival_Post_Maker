package com.example.festivalpostmakerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeScreen extends AppCompatActivity {

    private ImageView back, share, download;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_screen);
        initBinding();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });


        ImageView image = findViewById(R.id.image);

        Intent intent = getIntent();
        int i = intent.getIntExtra("image",0);

        if (i != 0){
            image.setImageResource(i);
        }else {
            image.setImageResource(R.drawable.img);
        }

    }

    public void initBinding(){

        back = findViewById(R.id.back);
        share = findViewById(R.id.share);
        download = findViewById(R.id.download);

    }
}