package com.example.android.memo_empty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import madgaze.x5_gesture.detector.MADGestureTouchDetector;
import madgaze.x5_gesture.listener.MADTouchGestureListener;
import madgaze.x5_gesture.view.MADGestureView;
import madgaze.x5_gesture.view.MADPagerView;

public class MainActivity extends AppCompatActivity {

    // wxf: this is page tab view code
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //wxf:
        MADGestureView gestureView = (MADGestureView) findViewById(R.id.gestureView);
        MADPagerView viewPager = (MADPagerView) findViewById(R.id.viewPager);
        TestPagerAdapter adapter = new TestPagerAdapter(this, new ArrayList<>(Arrays.asList("Page 1", "Page 2", "Page 3")));
        gestureView.getGestureListener().setOnTouchListener(viewPager.getDefaultOnTouchListener());
        viewPager.setAdapter(adapter);
    }
}
