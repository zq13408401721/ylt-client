package com.yltclient.ui.own.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yltclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class IntegralTurnActivity extends AppCompatActivity implements View.OnClickListener {

    private Unbinder unbinder;
    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.tv_integral_record)
    TextView tvRecord;
    @BindView(R.id.et_address)
    EditText etAddress;
    @BindView(R.id.img_sweep)
    ImageView imgSweep;
    @BindView(R.id.et_count)
    EditText etCount;
    @BindView(R.id.txt_integral)
    TextView txtIntegral;
    @BindView(R.id.tv_get_integral)
    TextView txtGetIntegral;
    @BindView(R.id.tv_sure)
    TextView tvSure;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integral_turn);
        unbinder = ButterKnife.bind(this);
        initView();
    }
    public void initView(){
        imgBack.setOnClickListener(this);
        tvRecord.setOnClickListener(this);
        imgSweep.setOnClickListener(this);
        txtIntegral.setOnClickListener(this);
        tvSure.setOnClickListener(this);
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
            case R.id.tv_integral_record:
                break;
            case R.id.img_sweep:
                break;
            case R.id.txt_integral:
                break;
            case R.id.tv_sure:
                break;
        }
    }
}