package com.yltclient.ui.mine.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.adapter.mine.AssetDetailRvAdapter;
import com.yltclient.adapter.mine.IncomeDetailRvAdapter;
import com.yltclient.bean.mine.AssetDetailBean;
import com.yltclient.bean.mine.IncomeDetailBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AssetDetailActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.toolbar_back)
    ImageView toolbarBack;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.tv_available_money)
    TextView tvAvailableMoney;//可用余额
    @BindView(R.id.tv_freeze_money)
    TextView tvFreezeMoney;//冻结余额
    @BindView(R.id.charge_money)
    TextView chargeMoney;//充币
    @BindView(R.id.get_money)
    TextView getMoney;//提币
    @BindView(R.id.rv_assetDetail)
    RecyclerView rvAssetDetail;
    List<AssetDetailBean> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_detail);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        list=new ArrayList<>();
        list.add(new AssetDetailBean("充币","2020.8.21 20:52:00","+7486.4"));
        list.add(new AssetDetailBean("直推收益","2020.8.21 20:52:00","+7486.4"));
        list.add(new AssetDetailBean("购买矿机","2020.8.21 20:52:00","-7486.4"));
        list.add(new AssetDetailBean("充币","2020.8.21 20:52:00","+7486.4"));

        toolbarTitle.setText("收益详情");
        toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        rvAssetDetail.setLayoutManager(new LinearLayoutManager(this));
        rvAssetDetail.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        AssetDetailRvAdapter assetDetailRvAdapter = new AssetDetailRvAdapter(this, list);
        rvAssetDetail.setAdapter(assetDetailRvAdapter);

        //监听充币
        chargeMoney.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.charge_money:

                startActivity(new Intent(this,ChargeMoneyActivity.class));
                break;
        }
    }
}