package com.allen.androidcustomview.activity;

import android.os.Bundle;

import com.allen.androidcustomview.R;
import com.allen.androidcustomview.base.BaseActivity;
import com.allen.androidcustomview.widget.RadarWaveView;

public class RadarActivity extends BaseActivity {

    private RadarWaveView radarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar);

        radarView = findViewById(R.id.radar_view);
    }

    @Override
    protected void onResume() {
        super.onResume();
        radarView.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        radarView.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        radarView.stop();
    }
}
