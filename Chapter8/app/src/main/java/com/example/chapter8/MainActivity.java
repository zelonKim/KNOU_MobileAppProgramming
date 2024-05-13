package com.example.chapter8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestView tv = new TestView(this);
        setContentView(tv);
    }
}

class TestView extends View {
    public TestView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.CYAN);

        Paint Pnt = new Paint();
        Pnt.setColor(Color.YELLOW);

        canvas.drawRect(320, 300, 1020, 1000, Pnt);
    }
}
*/


/*
  public class MainActivity extends AppCompatActivity {
      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          TestView tv = new TestView(this);
          setContentView(tv);
      }
  }

class TestView extends View {
    public TestView(Context context) {
        super(context);
    }
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.LTGRAY);

        Paint Pnt = new Paint();
        Pnt.setStrokeWidth(30f);

        Pnt.setColor(Color.RED);
        canvas.drawRect(10,10,200,400,Pnt);

        Pnt.setColor(0x800000ff);
        canvas.drawCircle(350, 550, 250, Pnt);

        Pnt.setColor(Color.BLACK);
        canvas.drawPoint(30, 30, Pnt);
        canvas.drawLine(700, 700, 900, 900, Pnt);

        Pnt.setColor(Color.GREEN);
        Pnt.setTextSize(100);
        canvas.drawText("Canvas Text Finish", 100, 1000, Pnt);
    }
}
*/



/*

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.shortmsg).setOnClickListener(mClickListener);
        findViewById(R.id.longmsg).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            if(v.getId() == R.id.shortmsg){
                Toast.makeText(MainActivity.this, "짧은 시간 동안 출력됩니다", Toast.LENGTH_SHORT).show();
            }
            if(v.getId() == R.id.longmsg){
                Toast.makeText(MainActivity.this, "긴 시간 동안 출력됩니다", Toast.LENGTH_LONG).show();
            }
        }
    };
}
*/



public class MainActivity extends AppCompatActivity {
    SoundPool mPool;
    int mDing;
    AudioManager mAm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        mDing = mPool.load(this, R.raw.bgm, 1);

        mAm = (AudioManager) getSystemService(AUDIO_SERVICE);

        findViewById(R.id.beep1).setOnClickListener(mClickListener);
        findViewById(R.id.beep2).setOnClickListener(mClickListener);
    }

    View.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            MediaPlayer player;
            if (v.getId() == R.id.beep1) {
                mPool.play(mDing, 1, 1, 0, 0, 1);
            }
            if (v.getId() == R.id.beep2) {
                mAm.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
            }
        }
    };
}


















