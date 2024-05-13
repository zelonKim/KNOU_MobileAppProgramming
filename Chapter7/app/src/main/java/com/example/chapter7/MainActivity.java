package com.example.chapter7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        findViewById(R.id.buttonid).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView txt = (TextView) findViewById(R.id.textid);
                txt.setTextSize(40);
            }
        });
*/

        findViewById(R.id.buttonid).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView img = (ImageView) findViewById(R.id.imageid);
                img.setColorFilter(Color.BLUE);
            }
        });
    }
}
