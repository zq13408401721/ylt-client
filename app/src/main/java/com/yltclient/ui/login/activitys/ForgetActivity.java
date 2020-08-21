package com.yltclient.ui.login.activitys;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.yltclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgetActivity extends AppCompatActivity {

    @BindView(R.id.image_forget_back)
    ImageView imageForgetBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.image_forget_back)
    public void onViewClicked() {
        finish();
    }
}