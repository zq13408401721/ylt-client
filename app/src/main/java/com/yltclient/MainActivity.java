package com.yltclient;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
=======
import androidx.core.widget.NestedScrollView;
>>>>>>> origin/master

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
<<<<<<< HEAD
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        ConsultFragment consultFragment = new ConsultFragment();
        fragmentTransaction.add(R.id.fl,consultFragment);
        fragmentTransaction.show(consultFragment);
        fragmentTransaction.commit();
=======
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
>>>>>>> origin/master
    }
}