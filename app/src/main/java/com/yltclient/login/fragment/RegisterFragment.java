package com.yltclient.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yltclient.R;
import com.yltclient.login.activitys.AgreementActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

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
    @BindView(R.id.rb_register_accept)
    CheckBox rbRegisterAccept;
    @BindView(R.id.tv_register_agreement)
    TextView tvRegisterAgreement;

    private TextView textView;
    private Unbinder bind;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_register, container, false);
        bind = ButterKnife.bind(this, inflate);
        return inflate;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            textView.setVisibility(View.GONE);
        } else {
            textView.setVisibility(View.VISIBLE);
        }
    }

    public void setTextStatus(TextView tvLoginWatch) {
        this.textView = tvLoginWatch;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    @OnClick(R.id.tv_register_agreement)
    public void onViewClicked() {
        Intent intent = new Intent(getActivity(), AgreementActivity.class);
        startActivity(intent);
    }
}
