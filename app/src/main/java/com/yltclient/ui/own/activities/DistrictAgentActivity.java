package com.yltclient.ui.own.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.adapter.own.OwnDistrictAgencyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class DistrictAgentActivity extends AppCompatActivity implements View.OnClickListener {

    private Unbinder unbinder;
    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.rcl_agency)
    RecyclerView rclAgency;
    private OwnDistrictAgencyAdapter ownAgencyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_agent);
        unbinder = ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        imgBack.setOnClickListener(this);
        rclAgency.setLayoutManager(new LinearLayoutManager(this));
        List<String> district = new ArrayList<>();
        district.add("宝安区");
        district.add("福田区");
        district.add("南山区");
        district.add("宝安区");
        district.add("龙岗区");
        ownAgencyAdapter = new OwnDistrictAgencyAdapter(this);
        rclAgency.setAdapter(ownAgencyAdapter);
        ownAgencyAdapter.setList(district);
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