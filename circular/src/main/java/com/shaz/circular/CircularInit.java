package com.shaz.circular;

import android.app.Activity;
import android.content.Intent;

public class CircularInit {

    public static void circle(Activity activity){
        Intent intent = new Intent(activity,CircleActivity.class);
        activity.startActivity(intent);
    }
}
