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
        }
    }
}
