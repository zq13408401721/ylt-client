package com.yltclient.ui.mine.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.adapter.mine.IncomeDetailRvAdapter;
import com.yltclient.bean.mine.IncomeDetailBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class IncomeDetailActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_back)
    ImageView toolbarBack;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.tv_mine_available)//可用数量
    TextView tvMineAvailable;
    @BindView(R.id.tv_mine_add)//累计瓦矿
    TextView tvMineAdd;
    @BindView(R.id.tv_mine_used)//已提数量
    TextView tvMineUsed;
    @BindView(R.id.get_money)//提币
    TextView getMoney;
    @BindView(R.id.rv_incomeDetail)
    RecyclerView rvIncomeDetail;
    private Unbinder bind;
    List<IncomeDetailBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_detail);
        bind = ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        list=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new IncomeDetailBean("挖矿收益","2020.8.21 17:49:02","+7486.4"));
        }
        toolbarTitle.setText("收益详情");
        toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        rvIncomeDetail.setLayoutManager(new LinearLayoutManager(this));
        rvIncomeDetail.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        IncomeDetailRvAdapter incomeDetailRvAdapter = new IncomeDetailRvAdapter(this, list);
        rvIncomeDetail.setAdapter(incomeDetailRvAdapter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }


}