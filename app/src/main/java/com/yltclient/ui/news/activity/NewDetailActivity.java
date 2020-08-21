package com.yltclient.ui.news.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yltclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewDetailActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_iv_back)
    ImageView toolbarIvBack;
    @BindView(R.id.toolbar_tv_title)
    TextView toolbarTvTitle;
    @BindView(R.id.tv_xitongtongzhi)
    TextView tvXitongtongzhi;
    @BindView(R.id.tv_date_tongzhi)
    TextView tvDateTongzhi;
    @BindView(R.id.tv_tata1_tongzhi)
    TextView tvTata1Tongzhi;
    @BindView(R.id.iv_img1_tongzhi)
    ImageView ivImg1Tongzhi;
    @BindView(R.id.tv_tata2_tongzhi)
    TextView tvTata2Tongzhi;
    @BindView(R.id.iv_img2_tongzhi)
    ImageView ivImg2Tongzhi;
    @BindView(R.id.tv_tata3_tongzhi)
    TextView tvTata3Tongzhi;
    @BindView(R.id.iv_img3_tongzhi)
    ImageView ivImg3Tongzhi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_detail);
        ButterKnife.bind(this);
        initView();
        initListener();
    }

    private void initListener() {
        toolbarIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initView() {

    }
}