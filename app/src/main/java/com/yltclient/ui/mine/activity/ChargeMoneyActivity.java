package com.yltclient.ui.mine.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yltclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChargeMoneyActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.toolbar_back)
    ImageView toolbarBack;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.charge_record)
    TextView chargeRecord; //充币记录
    @BindView(R.id.tv_charge_location)
    TextView tvChargeLocation;
    @BindView(R.id.tv_copy_location)
    TextView tvCopyLocation;
    @BindView(R.id.iv_qrCode)
    ImageView ivQrCode;
    @BindView(R.id.tv_save_qrCode)
    TextView tvSaveQrCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charge_money);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        toolbarTitle.setText("充币");
        toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        chargeRecord.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this,ChargeRecordActivity.class));
    }
}