package com.yltclient.ui.mine.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.adapter.mine.ChargeRecordRvAdapter;
import com.yltclient.bean.mine.ChargeRecordBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChargeRecordActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_back)
    ImageView toolbarBack;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.rv_chargeRecord)
    RecyclerView rvChargeRecord;

    List<ChargeRecordBean> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charge_record);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        list=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ChargeRecordBean("2020.05.09 16:04","500 USDT","完成"));
        }
        toolbarTitle.setText("充币记录");
        toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        rvChargeRecord.setLayoutManager(new LinearLayoutManager(this));

        ChargeRecordRvAdapter chargeRecordRvAdapter = new ChargeRecordRvAdapter(this, list);
        rvChargeRecord.setAdapter(chargeRecordRvAdapter);
    }
}