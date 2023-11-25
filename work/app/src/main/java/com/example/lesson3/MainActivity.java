package com.example.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int click = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textForClicks);
    }

    public void OnClick1(View v) {
        click ++;
        textView.setText("Clicks: " + click);
    }

    public void onClick2(View v) {
        click += 10;
        textView.setText("Clicks: " + click);
    }
    public void onClick3(View v) {
        click += 100;
        textView.setText("Clicks: " + click);
    }


}