package com.example.chapter15;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.OrientationEventListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    OrientationEventListener mOrientationListener;
    TextView mDir;
    TextView mArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOrientationListener = new OrientationEventListener(this, SensorManager.SENSOR_DELAY_NORMAL) {
            @Override
            public void onOrientationChanged(int orientation) {
                mDir.setText("회전 값:" + String.valueOf(orientation));
                if(orientation >= 315 || orientation < 45) {
                    mArrow.setRotation(0);
                } else if (orientation >= 45 && orientation < 135) {
                    mArrow.setRotation(270);
                } else if (orientation >= 135 && orientation < 225) {
                    mArrow.setRotation(180);
                } else if (orientation >= 225 && orientation < 315) {
                    mArrow.setRotation(90);
                }
            }
        };
        mOrientationListener.enable();
    }
}