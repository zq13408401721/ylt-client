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

public class CityAgencyActivity extends AppCompatActivity implements View.OnClickListener {

    private Unbinder unbinder;
    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.rcl_agency)
    RecyclerView rclAgency;
    private OwnAgencyAdapter ownAgencyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_agency);
        unbinder = ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        imgBack.setOnClickListener(this);
        rclAgency.setLayoutManager(new LinearLayoutManager(this));
        List<String> cities = new ArrayList<>();
        cities.add("潮州市");
        cities.add("深圳市");
        cities.add("东莞市");
        cities.add("佛山市");
        cities.add("揭阳市");
        ownAgencyAdapter = new OwnAgencyAdapter(this);
        rclAgency.setAdapter(ownAgencyAdapter);
        ownAgencyAdapter.setType(1);
        ownAgencyAdapter.setList(cities);
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