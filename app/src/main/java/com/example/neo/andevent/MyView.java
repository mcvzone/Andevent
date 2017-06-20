package com.example.neo.andevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by neo on 2017-06-18.
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
            Log.d("MYLOG", "touch down.");
        } else if(motionEvent.getAction() == MotionEvent.ACTION_UP){
            Log.d("MYLOG", "touch up.");
        } else if(motionEvent.getAction() == MotionEvent.ACTION_MOVE){
            Log.d("MYLOG", "touch move");
        }
        return true;
    }
}
