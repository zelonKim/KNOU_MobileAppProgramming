package com.example.chapter13;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
/*

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arGeneral = new ArrayList<String>();
        arGeneral.add("APPLE");
        arGeneral.add("BANANA");
        arGeneral.add("ORANGE");
        arGeneral.add("MANGO");

        ArrayAdapter<String> Adapter;
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, arGeneral);

        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);
    }
}*/

/*

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> Adapter;
        Adapter = ArrayAdapter.createFromResource(this, R.array.mobile, android.R.layout.simple_list_item_multiple_choice);

        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);

        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setDivider(new ColorDrawable(Color.BLUE));
        list.setDividerHeight(5);
    }
}*/



public class MainActivity extends AppCompatActivity {
    ArrayAdapter<CharSequence> adspin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner)findViewById(R.id.myspinner);
        spin.setPrompt("Colors");

        adspin = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);

        adspin.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        spin.setAdapter(adspin);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(MainActivity.this, adspin.getItem(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
    }
}
