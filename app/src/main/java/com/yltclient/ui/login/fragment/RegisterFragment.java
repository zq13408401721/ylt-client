package com.yltclient.ui.login.fragment;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.yltclient.R;

import butterknife.BindView;

public class RegisterFragment extends Fragment {

    @BindView(R.id.et_register_phone)
    EditText etRegisterPhone;
    @BindView(R.id.et_register_password)
    EditText etRegisterPassword;
    @BindView(R.id.et_register_passwordAgain)
    EditText etRegisterPasswordAgain;
    @BindView(R.id.et_register_location)
    EditText etRegisterLocation;
    @BindView(R.id.et_register_invCode)
    EditText etRegisterInvCode;
    @BindView(R.id.et_register_verCode)
    EditText etRegisterVerCode;
    @BindView(R.id.tv_register_verCode)
    TextView tvRegisterVerCode;
    @BindView(R.id.img_register_btn)
    ImageView imgRegisterBtn;
    @BindView(R.id.tv_register_text)
    TextView tvRegisterText;

    private  TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_register, container, false);
        return inflate;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser){
            textView.setVisibility(View.GONE);
        }else{
            textView.setVisibility(View.VISIBLE);
        }
    }

    public void setTextStatus(TextView tvLoginWatch) {
        this.textView=tvLoginWatch;
    }
}
