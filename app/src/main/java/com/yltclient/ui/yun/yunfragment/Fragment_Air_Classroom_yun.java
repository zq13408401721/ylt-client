package com.yltclient.ui.yun.yunfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;


public class Fragment_Air_Classroom_yun extends Fragment {

    private RecyclerView airClassroomRv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment__air__classroom_yun, container, false);
        initView(inflate);
        return inflate;

    }

    private void initView(View inflate) {
        airClassroomRv = inflate.findViewById(R.id.air_classroom_rv);
    }
}