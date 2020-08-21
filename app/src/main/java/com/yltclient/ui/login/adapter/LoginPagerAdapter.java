package com.yltclient.ui.login.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class LoginPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> data;

    public LoginPagerAdapter(@NonNull FragmentManager fm, List<Fragment> data) {
        super(fm);
        this.data = data;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
