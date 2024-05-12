package com.example.chapter6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        ImageView img = (ImageView) findViewById(R.id.img);
                        if(img.getVisibility() == View.VISIBLE) {
                            img.setVisibility(View.GONE);
                        } else {
                            img.setVisibility(View.VISIBLE);
                        }
                    }
                }
        );
    }
}