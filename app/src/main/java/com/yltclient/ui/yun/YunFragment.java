package com.yltclient.ui.yun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.yltclient.R;
import com.yltclient.ui.yun.yunfragment.Fragment_Air_Classroom_yun;
import com.yltclient.ui.yun.yunfragment.Fragment_Mine_Field_yun;
import com.yltclient.ui.yun.yunfragment.Fragment_Video_yun;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

//fragment_yun
public class YunFragment extends Fragment {


    private String[] tabs = {"矿场介绍", "视频", "空中课堂"};
    private List<Fragment> fragments;
    private Toolbar yunTolbar;
    private TabLayout yunTabLayout;
    private ViewPager viewpager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_yun, container, false);
        initView(inflate);
        return inflate;

    }

    private void initView(View inflate) {
        yunTolbar = inflate.findViewById(R.id.yun_tolbar);
        yunTabLayout = inflate.findViewById(R.id.yun_tabLayout);
        viewpager = inflate.findViewById(R.id.viewpager);

        fragments = new ArrayList<>();
        fragments.add(new Fragment_Mine_Field_yun());
        fragments.add(new Fragment_Video_yun());
        fragments.add(new Fragment_Air_Classroom_yun());


        //初始化ViewPager
        viewpager.setAdapter(new MyAdapter(getChildFragmentManager()));
        yunTabLayout.setupWithViewPager(viewpager);
    }

    class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        //写出getPagertitle方法
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }
    }
}
