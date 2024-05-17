package com.example.chpater14;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mOnClick(View v) {
        AlertDialog.Builder bld = new AlertDialog.Builder(this);

        bld.setTitle("MESSAGE");
        bld.setMessage("AlertDialog Test is success");
        bld.setIcon(R.mipmap.ic_launcher);
        bld.show();
    }
}
*/


/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mOnClick(View v) {
        new AlertDialog.Builder(this)
                .setTitle("MESSAGE")
                .setMessage("AlertDialog Test is success")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which){} })
                .show();

    }
}
*/



/*
public class MainActivity extends AppCompatActivity {
    Button btnSelectedDate;
    DatePickerDialog datePickerDialog;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSelectedDate = (Button) findViewById(R.id.button1);
        display = (TextView) findViewById(R.id.text1);
    }
    public void onClick(View v) {
        if (v == btnSelectedDate) {
            final Calendar c = Calendar.getInstance(); // 싱글톤 패턴 -> 하나의 객체를 메모리에서 서로 공유함.
            int mYear = c.get(Calendar.YEAR);
            int mMonth = c.get(Calendar.MONTH);
            int mDay = c.get(Calendar.DAY_OF_MONTH);

            datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    display.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                }
            }, mYear, mMonth, mDay
        );
        datePickerDialog.show();
        }
    }
}*/



public class MainActivity extends AppCompatActivity {
    TimePicker timePicker1;
    TextView text1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            timePicker1 = findViewById(R.id.timePicker1);

            final Calendar c = Calendar.getInstance();
            int mHour = c.get(Calendar.HOUR_OF_DAY);
            int mMinute = c.get(Calendar.MINUTE);

            timePicker1.setHour(mHour); // 현재 시간을 타임피커에 반영함.
            timePicker1.setMinute(mMinute);
        }

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    text1 = findViewById(R.id.text1);
                    int mHour = timePicker1.getHour();
                    int mMinute = timePicker1.getMinute();
                    text1.setText(mHour + ":" + mMinute);
                }
            }
        });

    }

}