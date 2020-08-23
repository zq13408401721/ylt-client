package com.yltclient.ui.mine;

import android.content.Intent;
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
import com.yltclient.ui.mine.activity.AssetDetailActivity;
import com.yltclient.ui.mine.activity.IncomeDetailActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MineFragment extends Fragment implements View.OnClickListener {
    private Unbinder unbinder;

    @BindView(R.id.tv_mine_earning)
    TextView tv_mine_earning;
    @BindView(R.id.tv_mine_currency)
    TextView tv_mine_currency;
    @BindView(R.id.tv_mine_available)
    TextView tv_mine_available;
    @BindView(R.id.tv_mine_used)
    TextView tv_mine_used;
    @BindView(R.id.tv_mine_add)
    TextView tv_mine_add;
    @BindView(R.id.mine_incomeDetails)//收益详情
    TextView mine_incomeDetails;
    @BindView(R.id.main_assetDetails)//资产详情
    TextView main_assetDetails;
    @BindView(R.id.rv_mine)
    RecyclerView rv_mine;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_mine, container, false);
        unbinder = ButterKnife.bind(this, inflate);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }


    private void initView() {
        rv_mine.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_mine.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        rv_mine.setAdapter(new MineRvAdapter(getActivity()));

        //收益详情
        mine_incomeDetails.setOnClickListener(this);
        main_assetDetails.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.mine_incomeDetails:
                //跳转到收益详情界面
                startActivity(new Intent(getActivity(), IncomeDetailActivity.class));
                break;
            case R.id.main_assetDetails:
                //跳转到资产详情界面
                startActivity(new Intent(getActivity(), AssetDetailActivity.class));
                break;

        }
    }
}
