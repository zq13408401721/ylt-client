package com.yltclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

import com.yltclient.common.MyView;

public class MainActivity extends AppCompatActivity {


    private MyView myView;
    NestedScrollView scrollView;
    private int height = MyView.HEIGHT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int width = ((WindowManager)this.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();
        this.setContentView(R.layout.activity_main);
        myView = this.findViewById(R.id.myView);
        scrollView = this.findViewById(R.id.scrollView);
        myView.setW(width);
        myView.setH(height);

        scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                height = (int) (MyView.HEIGHT-0.4*scrollY);
                myView.setH(height);
            }
        });
    }
}