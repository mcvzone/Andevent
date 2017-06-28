package com.example.neo.andevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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
        findViewById(R.id.main_btn_tab).setOnClickListener(this);

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

            case R.id.main_btn_tab:
                intent = new Intent(getApplicationContext(), TabActivity.class);
                startActivity(intent);
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if( id == R.id.action_settings ){
            return true;
        } else if( id == R.id.action_search ){
            Toast.makeText(getApplicationContext(), "검색 메뉴가 선택됨.", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
