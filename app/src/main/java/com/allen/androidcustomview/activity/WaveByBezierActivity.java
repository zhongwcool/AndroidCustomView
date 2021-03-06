package com.allen.androidcustomview.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.allen.androidcustomview.R;
import com.allen.androidcustomview.widget.WaveViewByBezier;

public class WaveByBezierActivity extends AppCompatActivity {

    private WaveViewByBezier waveViewByBezier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave_by_bezier);

        waveViewByBezier = findViewById(R.id.wave_bezier);

        waveViewByBezier.startAnimation();
    }

    @Override
    protected void onPause() {
        super.onPause();
        waveViewByBezier.pauseAnimation();
    }

    @Override
    protected void onResume() {
        super.onResume();
        waveViewByBezier.resumeAnimation();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        waveViewByBezier.stopAnimation();
    }
}
