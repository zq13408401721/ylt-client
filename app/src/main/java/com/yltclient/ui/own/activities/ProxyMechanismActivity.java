package com.yltclient.ui.own.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.adapter.own.OwnAgencyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ProxyMechanismActivity extends AppCompatActivity implements View.OnClickListener {

    private Unbinder unbinder;
    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.rcl_agency)
    RecyclerView rclAgency;
    private OwnAgencyAdapter ownAgencyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_mechanism);
        unbinder = ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        imgBack.setOnClickListener(this);
        rclAgency.setLayoutManager(new LinearLayoutManager(this));
        List<String> province = new ArrayList<>();
        province.add("广东省");
        province.add("湖南省");
        province.add("北京");
        province.add("江西省");
        province.add("上海");
        ownAgencyAdapter = new OwnAgencyAdapter(this);
        rclAgency.setAdapter(ownAgencyAdapter);
        ownAgencyAdapter.setType(0);
        ownAgencyAdapter.setList(province);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_back:
                finish();
                break;
        }
    }
}