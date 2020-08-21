package com.yltclient.ui.own.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yltclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BusinessSchoolActivity extends AppCompatActivity implements View.OnClickListener {

    private Unbinder unbinder;
    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.tv_integral_turn)
    TextView tvIntegralTurn;
    @BindView(R.id.tv_content)
    TextView tvContent;
    @BindView(R.id.img_cover)
    ImageView imgCover;
    @BindView(R.id.tv_get_integral)
    TextView tvGetIntegral;
    @BindView(R.id.img_line)
    ImageView imgLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_school);
        unbinder = ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        imgBack.setOnClickListener(this);
        tvIntegralTurn.setOnClickListener(this);
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
            case R.id.tv_integral_turn:
                startActivity(new Intent(BusinessSchoolActivity.this,IntegralTurnActivity.class));
                break;
        }
    }
}