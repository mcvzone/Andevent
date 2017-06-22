package com.example.neo.andevent;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ViewPagerActivity extends AppCompatActivity {

    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewpager = (ViewPager)findViewById(R.id.pager);

        MyAdapter adapter = new MyAdapter();
        viewpager.setAdapter(adapter);

        //버튼 클릭시 특정 화면으로 이동.
        findViewById(R.id.view_bt_viewpager).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewpager.setCurrentItem(1);
            }
        });
    }

    class MyAdapter extends PagerAdapter{
        String[] names = {"소시", "걸", "씨"};

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);

            TextView view = new TextView(getApplicationContext());
            view.setText(names[position]);
            view.setTextSize(40.0f);
            layout.addView(view);

            container.addView(layout);

            return layout;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View)object);
        }

        @Override
        public int getCount() {
            return names.length;    //화면 갯수
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }
    }
}
