package com.yltclient.ui.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.adapter.mine.MineRvAdapter;

public class MineFragment extends Fragment {

    private TextView tv_mine_earning;
    private TextView tv_mine_currency;
    private TextView tv_mine_available;
    private TextView tv_mine_used;
    private TextView tv_mine_add;
    private TextView mine_incomeDetails;
    private TextView main_assetDetails;
    private RecyclerView rv_mine;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_mine, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        rv_mine=inflate.findViewById(R.id.rv_mine);
        rv_mine.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_mine.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));

        rv_mine.setAdapter(new MineRvAdapter(getActivity()));
    }
}
