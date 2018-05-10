package com.shaz.circularimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shaz.circular.CircularInit;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CircularInit.circle(this);
    }

   /* private Drawable getProgressDrawable() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        int value = Integer.parseInt(prefs.getString(getString(R.string.progressBar_pref_key), getString(R.string.progressBar_pref_defValue)));
        Drawable progressDrawable = null;
        switch (value) {
            case FOLDING_CIRCLES:
                progressDrawable = new FoldingCirclesDrawable.Builder(this)
                        .colors(getProgressDrawableColors())
                        .build();
                break;

            case MUSIC_DICES:
                progressDrawable = new GoogleMusicDicesDrawable.Builder().build();
                break;

            case NEXUS_CROSS_ROTATION:
                progressDrawable = new NexusRotationCrossDrawable.Builder(this)
                        .colors(getProgressDrawableColors())
                        .build();
                break;

            case CHROME_FLOATING_CIRCLES:
                progressDrawable = new ChromeFloatingCirclesDrawable.Builder(this)
                        .colors(getProgressDrawableColors())
                        .build();
                break;
        }

        return progressDrawable;
    }*/

}
