package com.example.chapter12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
/*

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        ft = manager.beginTransaction();
    }
    public void showFragment(View view) {
        ft = manager.beginTransaction(); // 시작
        if(view == findViewById(R.id.button1)) {
            FragmentFirst fr1 = new FragmentFirst();
            ft.replace(R.id.fragment_container, fr1); // 실행
            ft.commit(); // 종료
        } else {
            FragmentSecond fr2 = new FragmentSecond();
            ft.replace(R.id.fragment_container, fr2);
            ft.commit();
        }
    }
}
*/


public class MainActivity extends AppCompatActivity implements BottomFragment.BottomListener {
    TopFragment top;
    BottomFragment bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top = new TopFragment();
        bottom = new BottomFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.TopFrame, top)
                .replace(R.id.BottomFrame, bottom)
                .commit();
    }
    @Override
    public void BottomSender(CharSequence input) {
        top.setText(input);
    }
}

