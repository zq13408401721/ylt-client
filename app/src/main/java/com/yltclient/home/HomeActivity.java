package com.yltclient.home;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.yltclient.R;

import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private Toolbar mToolbar;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    private AppBarLayout mAppBarLayout;
    private ImageView mUserPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.mian_tab);
        mViewPager = (ViewPager) findViewById(R.id.mian_vp);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mUserPhone = (ImageView) findViewById(R.id.ah_ImageView);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.appbar);

        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);

        List<Fragment> fragments = Arrays.asList(new SetmealOneFragment(), new SetmealOneFragment(), new SetmealOneFragment());
        List<String> title = Arrays.asList("套餐一", "套餐二", "套餐三");
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return title.get(position);
            }
        });
        mTabLayout.setupWithViewPager(mViewPager);

        mUserPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initPopShow();
            }
        });
    }


    private void initPopShow() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.view_home_pop_phone, null);
        PopupWindow window = new PopupWindow(inflate, ViewPager.LayoutParams.WRAP_CONTENT, ViewPager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        window.setOutsideTouchable(true);
        window.setTouchable(true);
        window.showAtLocation(mCollapsingToolbarLayout, Gravity.CENTER, 0, 0);
    }
}