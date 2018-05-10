package com.shaz.circular;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.jpardogo.android.googleprogressbar.library.GoogleMusicDicesDrawable;

public class CircleActivity extends AppCompatActivity {
    ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        mProgressBar = (ProgressBar)findViewById(R.id.google_progress);
        Rect bounds = mProgressBar.getIndeterminateDrawable().getBounds();
        mProgressBar.setIndeterminateDrawable( new GoogleMusicDicesDrawable.Builder().build());
        mProgressBar.getIndeterminateDrawable().setBounds(bounds);
    }
}
