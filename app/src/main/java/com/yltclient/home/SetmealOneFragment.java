package com.yltclient.home;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.yltclient.R;

public class SetmealOneFragment extends Fragment {

    private Button mBuy;
    private TextView meal_TextView2;
    private LinearLayout meal_LinearLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_setmealone, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView(getView());
    }

    private void initView(View view) {
        mBuy = (Button) view.findViewById(R.id.mealone_buy);
        meal_TextView2 = (TextView) view.findViewById(R.id.meal_TextView2);
        meal_LinearLayout = (LinearLayout) view.findViewById(R.id.meal_LinearLayout);
        mBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ComfirmActivity.class));
            }
        });

        meal_TextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initPopShow();
            }
        });
    }

    private void initPopShow() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_home_just_host, null);
        PopupWindow window = new PopupWindow(inflate, ViewPager.LayoutParams.WRAP_CONTENT, ViewPager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        window.setOutsideTouchable(true);
        window.setTouchable(true);
        window.showAtLocation(meal_LinearLayout, Gravity.BOTTOM, 0, 0);

        TextView view = (TextView) inflate.findViewById(R.id.view_home_pop_TextView);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), JustHostActivity.class));
            }
        });
    }
}
