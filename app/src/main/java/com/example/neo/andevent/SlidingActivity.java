package com.example.neo.andevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class SlidingActivity extends AppCompatActivity {
    Animation translate_left;
    Animation translate_right;
    LinearLayout ll;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding);

        translate_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_left);
        translate_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_right);


        translate_left.setAnimationListener(new Animation.AnimationListener(){

            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                btn.setText("닫기");
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

//        Button slidOpen = (Button)findViewById(R.id.slid_bt_open);
        translate_right.setAnimationListener(new Animation.AnimationListener(){

            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                btn.setText("열기");
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        ll = (LinearLayout)findViewById(R.id.slid_ly_pannel);
        btn = (Button)findViewById(R.id.slid_bt_open);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if( ll.getVisibility() == View.VISIBLE ){
                    ll.setVisibility(View.GONE);
                    ll.startAnimation(translate_right);
                } else {
                    ll.setVisibility(View.VISIBLE);
                    ll.startAnimation(translate_left);
                }

            }
        });
    }
}
