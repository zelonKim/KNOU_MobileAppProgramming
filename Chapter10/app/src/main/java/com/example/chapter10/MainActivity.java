package com.example.chapter10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
/*

public class MainActivity extends AppCompatActivity {
    private MyView vw;
    public class Vertex {
        Vertex(float ax, float ay, boolean ad) {
            x = ax;
            y= ay;
            Draw = ad;
        }
        float x;
        float y;
        boolean Draw;
    }

    ArrayList<Vertex> arVertex;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vw = new MyView(this);
        setContentView(vw);
        arVertex = new ArrayList<Vertex>();
    }


    protected class MyView extends View {
        Paint Pnt;
        public MyView(Context context) {
            super(context);
            Pnt = new Paint();
            Pnt.setColor(Color.BLUE);
            Pnt.setStrokeWidth(3);
            Pnt.setAntiAlias(true);
        }

        public void onDraw(Canvas canvas) {
            int i;
            canvas.drawColor(Color.LTGRAY);
            for (i=0; i<arVertex.size(); i++) {
                if(arVertex.get(i).Draw) {
                    canvas.drawLine(arVertex.get(i-1).x, arVertex.get(i-1).y, arVertex.get(i).x, arVertex.get(i).y, Pnt);
                }
            }
        }

        public boolean onTouchEvent(MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                arVertex.add(new Vertex(event.getX(), event.getY(), false));
                return true;
            }
            if(event.getAction() == MotionEvent.ACTION_MOVE) {
                arVertex.add(new Vertex(event.getX(), event.getY(), true));
                invalidate();
                return true;
            }
            return false;
        }
    }
}
*/


/*
public class MainActivity extends AppCompatActivity {
    private MyView vw;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vw = new MyView(this);
        vw.setFocusable(true);
        vw.setFocusableInTouchMode(true);
        setContentView(vw);
    }


    protected class MyView extends View {
        float mX, mY, mR, mL;
        int mColor;
        public MyView(Context context) {
            super(context);
            mX = 500;
            mY = 500;
            mR = 600;
            mL = 600;
            mColor=Color.RED;
        }
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint Pnt = new Paint();
            Pnt.setColor(mColor);
            Pnt.setAntiAlias(true);
            canvas.drawRect(mX, mY, mR, mL, Pnt);
        }

        public boolean onKeyDown(int KeyCode, KeyEvent event) {
            super.onKeyDown(KeyCode, event);
            if(event.getAction() == KeyEvent.ACTION_DOWN) {
                if (KeyCode == KeyEvent.KEYCODE_DPAD_LEFT) {
                    mX -= 5;
                    mR -= 5;
                    invalidate();
                    return true;
                }
                if (KeyCode == KeyEvent.KEYCODE_DPAD_RIGHT) {
                    mX += 5;
                    mR += 5;
                    invalidate();
                    return true;
                }
                if (KeyCode == KeyEvent.KEYCODE_DPAD_UP) {
                    mY -= 5;
                    mL -= 5;
                    invalidate();
                    return true;
                }
                if (KeyCode == KeyEvent.KEYCODE_DPAD_DOWN) {
                    mY += 5;
                    mL += 5;
                    invalidate();
                    return true;
                }
            }
            return false;
        }
        public void setFocusable(boolean b) {

        }
    }
}
*/

/*
public class MainActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGood = (Button) findViewById(R.id.good);
        btnGood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textPoll = (TextView) findViewById(R.id.question);
                textPoll.setText("It`s Good:D");
            }
        });
        Button btnBad = (Button) findViewById(R.id.bad);
        btnBad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textPoll = (TextView) findViewById(R.id.question);
                textPoll.setText("It`s Bad:X");
            }
        });

    }
}
 */


/*
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGood = (Button)findViewById(R.id.good);
        btnGood.setOnClickListener(this);

        Button btnBad = (Button)findViewById(R.id.bad);
        btnBad.setOnClickListener(this);
    }

    public void onClick(View v) {
        TextView textPoll = (TextView)findViewById(R.id.question);
        if(v.getId() == R.id.good) {
            textPoll.setText("It`s Good");
        }
        if(v.getId() == R.id.bad) {
            textPoll.setText("It`s Bad");
        }
    }
}
 */



public class MainActivity extends AppCompatActivity {
    int value = 0;
    TextView mText;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView)findViewById(R.id.text);
        mHandler.sendEmptyMessage(0);
    }

    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            value++;
            mText.setText("Timer value = " + value);
            mHandler.sendEmptyMessageDelayed(0, 1000);
        }
    };
}