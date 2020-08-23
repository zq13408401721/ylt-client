package com.yltclient.ui.home;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.yltclient.R;
import com.yltclient.home.SetmealOneFragment;

import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private Toolbar mToolbar;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    private AppBarLayout mAppBarLayout;
    private ImageView mUserPhone;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView(getView());
    }

    private void initView(View view) {
        mTabLayout = (TabLayout) view.findViewById(R.id.mian_tab);
        mViewPager = (ViewPager) view.findViewById(R.id.mian_vp);
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        mUserPhone = (ImageView) view.findViewById(R.id.ah_ImageView);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.collapsingToolbar);
        mAppBarLayout = (AppBarLayout) view.findViewById(R.id.appbar);

        List<Fragment> fragments = Arrays.asList(new SetmealOneFragment(), new SetmealOneFragment(), new SetmealOneFragment());
        List<String> title = Arrays.asList("套餐一", "套餐二", "套餐三");
        mViewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
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
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_home_pop_phone, null);
        PopupWindow window = new PopupWindow(inflate, ViewPager.LayoutParams.WRAP_CONTENT, ViewPager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        window.setOutsideTouchable(true);
        window.setTouchable(true);
        window.showAtLocation(mCollapsingToolbarLayout, Gravity.CENTER, 0, 0);
    }


}
