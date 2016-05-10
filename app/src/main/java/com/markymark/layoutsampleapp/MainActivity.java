package com.markymark.layoutsampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to see other layouts set layout file to
        //frame_layout_sample, linear_layout_basic, or linear_layout_weights
        setContentView(R.layout.relative_layout_sample);
    }
}
