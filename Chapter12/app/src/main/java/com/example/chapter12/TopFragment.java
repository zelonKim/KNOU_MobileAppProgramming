package com.example.chapter12;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TopFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top, container, false);
    }
    public void setText(CharSequence text) {
        TextView tv = (TextView)getView().findViewById(R.id.textView);
        tv.setText(text);
    }

}
