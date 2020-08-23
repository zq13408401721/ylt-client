package com.yltclient.home;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import com.yltclient.R;

public class ComfirmActivity extends AppCompatActivity {

    private TextView incomeDetails;
    private ConstraintLayout groups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comfirm);
        initView();
    }

    private void initView() {
        groups = (ConstraintLayout) findViewById(R.id.groups);
        incomeDetails = (TextView) findViewById(R.id.Comfir_incomeDetails);
        incomeDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initPopupWindow();
            }
        });
    }

    private void initPopupWindow() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.view_pop_transaction, null);
        TextView back = inflate.findViewById(R.id.view_pop_back);
        PopupWindow pop = new PopupWindow(inflate, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.WRAP_CONTENT);
        pop.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pop.setOutsideTouchable(true);
        pop.setTouchable(true);
        pop.showAtLocation(groups, Gravity.BOTTOM, 0, 0);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pop.dismiss();
            }
        });
    }
}