package com.yltclient.login.activitys;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yltclient.R;
import com.yltclient.common.GradientColorTextViewForManagerName;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgetActivity extends AppCompatActivity {

    @BindView(R.id.forget_phone)
    EditText forgetPhone;
    @BindView(R.id.forget_newpass)
    EditText forgetNewpass;
    @BindView(R.id.forget_affirm_newpass)
    EditText forgetAffirmNewpass;
    @BindView(R.id.forget_verification)
    EditText forgetVerification;
    @BindView(R.id.tv_register_verCode)
    GradientColorTextViewForManagerName tvRegisterVerCode;
    @BindView(R.id.tv_forget_back)
    TextView tvForgetBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_forget_back)
    public void onViewClicked() {
        finish();
    }
}