package com.yltclient.login;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.yltclient.R;
import com.yltclient.common.CustomViewPager;
import com.yltclient.login.adapter.LoginPagerAdapter;
import com.yltclient.login.fragment.LoginFragment;
import com.yltclient.login.fragment.RegisterFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.login_tabLayout)
    TabLayout loginTabLayout;
    @BindView(R.id.login_viewPager)
    CustomViewPager loginViewPager;
    @BindView(R.id.img_login_bg)
    ImageView imgLoginBg;
    @BindView(R.id.tv_login_watch)
    TextView tvLoginWatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initView();
        initViewPager();

    }

    private void initViewPager() {

        loginViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                loginViewPager.resetHeight(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initView() {
        List<Fragment> data = new ArrayList<>();
        LoginFragment loginFragment = new LoginFragment();
        RegisterFragment registerFragment = new RegisterFragment();
        data.add(loginFragment);
        data.add(registerFragment);


        LoginPagerAdapter loginPagerAdapter = new LoginPagerAdapter(getSupportFragmentManager(), data);
        loginViewPager.setAdapter(loginPagerAdapter);

        loginTabLayout.setupWithViewPager(loginViewPager);

        loginTabLayout.getTabAt(0).setText("登录");
        loginTabLayout.getTabAt(1).setText("注册");

        registerFragment.setTextStatus(tvLoginWatch);

    }
}