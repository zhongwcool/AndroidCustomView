package com.allen.androidcustomview.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.allen.androidcustomview.R;
import com.allen.androidcustomview.widget.DragBallView;


public class DragBallActivity extends AppCompatActivity {


    private Button resetBtn, msgCountBtn;
    private DragBallView dragBallView;
    private EditText msgCountEt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_ball);
        resetBtn = findViewById(R.id.reset_btn);
        msgCountBtn = findViewById(R.id.msg_count_btn);
        dragBallView = findViewById(R.id.drag_ball_view);

        msgCountEt = findViewById(R.id.msg_count_et);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dragBallView.reset();
            }
        });

        msgCountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(msgCountEt.getText().toString().trim())) {
                    int count = Integer.valueOf(msgCountEt.getText().toString().trim());
                    dragBallView.setMsgCount(count);
                }
            }
        });

        dragBallView.setOnDragBallListener(new DragBallView.OnDragBallListener() {
            @Override
            public void onDisappear() {
                Toast.makeText(DragBallActivity.this, "消失了", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
