package com.example.chapter9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
/*
// 'View를 통한 '콜백 메서드'의 구현
public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View vw = new MyView(this);
        setContentView(vw);
    }

    class MyView extends View {
        public MyView(Context context) {
            super(context);
        }
        public boolean onTouchEvent(MotionEvent event) {
            super.onTouchEvent(event);
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }
}
*/


// '구현 클래스'를 통한 '이벤트 리스너'의 구현
/*
public class MainActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View vw = new View(this);
        vw.setOnTouchListener(TouchListener);
        setContentView(vw);
    }

    class TouchListenerClass implements View.OnTouchListener {
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "Touch Event Received:)", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }
        TouchListenerClass TouchListener = new TouchListenerClass();
    }
    */


/*

// '액티비티'를 통한 '이벤트 리스너'의 구현
public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View vw = new View(this);
        vw.setOnTouchListener(this);
        setContentView(vw);
    }

    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(this, "Touch Event Received:D", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
*/


/*
// 'View'를 통한 '이벤트 리스너'의 구현
public class MainActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView vw = new MyView(this);
        vw.setOnTouchListener(vw);
        setContentView(vw);
    }

    class MyView extends View implements View.OnTouchListener {
        public MyView(Context context) {
            super(context);
        }
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(MainActivity.this, "Toh Event Received:J", Toast.LENGTH_SHORT).show();
            return true;
            }
        return false;
        }
    }
}
*/


public class MainActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View vw = new MyView(this);
        vw.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Toast.makeText(MainActivity.this, "No.1 Listener: Touch Event Received", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
    });
        setContentView(vw);
    }


    protected class MyView extends View {
        public MyView(Context context) {
            super(context);
        }
        public boolean onTouchEvent(MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "No.2 View: Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(MainActivity.this, "No.3 Activity: Touch Event Received", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

}
