package com.example.neo.andevent;

import android.content.res.Configuration;
import android.gesture.Gesture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TouchEventActivity extends AppCompatActivity {

    GestureDetector detector;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_event);
        textview = (TextView)findViewById(R.id.touch_text_result);

        findViewById(R.id.touch_btn_touch).setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    textview.setText("touch down.");
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    textview.setText("touch up.");
                } else if(motionEvent.getAction() == MotionEvent.ACTION_MOVE){
                    textview.setText("touch move");
                }
                return true;
            }
        });

        detector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener(){

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                textview.setText("onScroll() 호출됨 : " + distanceX + " , " + distanceY); //이동위치
                return super.onScroll(e1, e2, distanceX, distanceY);
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                textview.setText("onFling() 호출됨 : " + velocityX + ", " + velocityY); //속도
                return super.onFling(e1, e2, velocityX, velocityY);
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if( detector != null ){
            return detector.onTouchEvent(event);
        } else {
            return super.onTouchEvent(event);
        }
    }

    /**
     * 키값을 확인 할때 사용.
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    /**
     * 백버튼 눌렀을 시
     */
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "onBackPressed() 호출됨", Toast.LENGTH_SHORT).show();
        //super.onBackPressed(); 해당 부분을 주석 하면, back 키를 눌렀을때 아무런 일을 하지 않도록 막을 수 있다.
        return;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if( newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(getApplicationContext(), "가로 방향으로 돌아감", Toast.LENGTH_SHORT).show();
        } else if( newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(getApplicationContext(), "세로 방향으로 돌아감", Toast.LENGTH_SHORT).show();
        }
        super.onConfigurationChanged(newConfig);
    }
}
