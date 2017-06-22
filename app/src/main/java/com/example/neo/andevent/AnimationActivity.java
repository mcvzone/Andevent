package com.example.neo.andevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        textView = (TextView)findViewById(R.id.ani_tx_textView);

        findViewById(R.id.ani_btn_start).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Animation translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                //textView.startAnimation(translate);
                ViewGroup container = (ViewGroup)findViewById(R.id.ani_layout_container);
                container.startAnimation(translate);
            }
        });
    }
}
