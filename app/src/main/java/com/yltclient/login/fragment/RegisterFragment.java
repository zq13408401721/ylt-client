package com.yltclient.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yltclient.MainActivity;
import com.yltclient.R;
import com.yltclient.login.activitys.AgreementActivity;
import com.yltclient.login.choosecity.JDCityPicker;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class RegisterFragment extends Fragment {


    @BindView(R.id.rb_register_accept)
    CheckBox rbRegisterAccept;
    @BindView(R.id.tv_register_agreement)
    TextView tvRegisterAgreement;
    @BindView(R.id.et_register_location)
    EditText etRegisterLocation;
    private TextView textView;
    private Unbinder bind;
    private JDCityPicker mJDCityPicker;

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

        etRegisterLocation.setFocusable(false);
        //返回键监听
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN && i == KeyEvent.KEYCODE_BACK) {
                    loginOut();
                    return true;
                }
                return false;
            }
        });

    }

    private void loginOut() {
        //获取自定义view
        View mDialogView = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_login_out, null);
        PopupWindow mPopWindow = new PopupWindow(mDialogView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, true);
        mPopWindow.setOutsideTouchable(false);
        //显示PopupWindow
        View rootview = LayoutInflater.from(getActivity()).inflate(R.layout.activity_main, null);
        mPopWindow.showAtLocation(rootview, Gravity.CENTER, 0, 0);
        bgAlpha(0.5f);
        mPopWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                bgAlpha(1f);
            }
        });
        //拦截点击事件，防止传到下一层
        RelativeLayout rl_dialog_login_out = (RelativeLayout) mDialogView.findViewById(R.id.rl_dialog_login_out);
        rl_dialog_login_out.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        //取消按钮
        Button bt_cancel = (Button) mDialogView.findViewById(R.id.bt_cancel);
        bt_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPopWindow.dismiss();
            }
        });

        //确定退出
        Button bt_ok = (Button) mDialogView.findViewById(R.id.bt_ok);
        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //.....do something
            }
        });

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
    public void onResume() {
        super.onResume();

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    @OnClick({R.id.et_register_location, R.id.tv_register_agreement})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.et_register_location:
                initChooseCity();
                break;
            case R.id.tv_register_agreement:
                Intent intent = new Intent(getActivity(), AgreementActivity.class);
                startActivity(intent);

                break;
        }
    }

    private void initChooseCity() {
        bgAlpha(0.7f);
        mJDCityPicker = new JDCityPicker(getActivity(), new JDCityPicker.onCitySelect() {
            @Override
            public void onSelect(String province, String city, String area) {
                etRegisterLocation.setText(province + "   " + city + "   " + area);
            }
        });
        mJDCityPicker.showAtLocation(etRegisterLocation, Gravity.BOTTOM, 0, 0);

        mJDCityPicker.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                bgAlpha(1.0f);
            }
        });
    }

    //背景变暗
    private void bgAlpha(float f) {
        WindowManager.LayoutParams layoutParams = getActivity().getWindow().getAttributes();
        layoutParams.alpha = f;
        getActivity().getWindow().setAttributes(layoutParams);
    }
}
