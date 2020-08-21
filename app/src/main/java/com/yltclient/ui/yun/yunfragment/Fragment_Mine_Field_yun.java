package com.yltclient.ui.yun.yunfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.ui.yun.yunapapter.Adapter_Mine_Field;


public class Fragment_Mine_Field_yun extends Fragment {


    private RecyclerView rvMineFieldYun;
    private Adapter_Mine_Field adapter_mine_field;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment__mine__field, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {


        rvMineFieldYun = (RecyclerView) inflate.findViewById(R.id.rv_mine_field_yun);
        rvMineFieldYun.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter_mine_field = new Adapter_Mine_Field(getActivity());
        rvMineFieldYun.setAdapter(adapter_mine_field);
        adapter_mine_field.notifyDataSetChanged();

    }
}