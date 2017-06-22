package com.example.neo.andevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_btn_touch).setOnClickListener(this);
        findViewById(R.id.main_btn_browser).setOnClickListener(this);
        findViewById(R.id.main_btn_animation).setOnClickListener(this);
        findViewById(R.id.main_btn_sliding).setOnClickListener(this);
        findViewById(R.id.main_btn_viewpager).setOnClickListener(this);
        findViewById(R.id.main_btn_progress).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.main_btn_touch:
                intent = new Intent(getApplicationContext(), TouchEventActivity.class);
                startActivity(intent);
                break;

            case R.id.main_btn_browser:
                intent = new Intent(getApplicationContext(), WebBrowserActivity.class);
                startActivity(intent);
                break;

            case R.id.main_btn_animation:
                intent = new Intent(getApplicationContext(), AnimationActivity.class);
                startActivity(intent);
                break;

            case R.id.main_btn_sliding:
                intent = new Intent(getApplicationContext(), SlidingActivity.class);
                startActivity(intent);
                break;

            case R.id.main_btn_viewpager:
                intent = new Intent(getApplicationContext(), ViewPagerActivity.class);
                startActivity(intent);
                break;

            case R.id.main_btn_progress:
                intent = new Intent(getApplicationContext(), ProgressSeekActivity.class);
                startActivity(intent);
                break;

        }
    }
}
