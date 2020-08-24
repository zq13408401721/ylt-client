package com.yltclient.ui.own.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.yltclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class PersonalInfomationActivity extends AppCompatActivity implements View.OnClickListener {

    private Unbinder unbinder;
    @BindView(R.id.img_head)
    ImageView imgHead;
    @BindView(R.id.constraint_perInfo)
    ConstraintLayout conPerInfo;
    @BindView(R.id.tv_proxy_mechanism)
    TextView tvProxyMechanism;
    @BindView(R.id.img_back)
    ImageView imgBack;
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_infomation);
        unbinder = ButterKnife.bind(this);
        initPop();
        initView();
    }

    private void initPop() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout_pop_photo, null, false);
        popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        Button btnCancel = inflate.findViewById(R.id.btn_cancel);
        Button btnPhoto = inflate.findViewById(R.id.btn_photo);
        Button btnPhotoGraph = inflate.findViewById(R.id.btn_photograph);
        btnCancel.setOnClickListener(this);
        btnPhoto.setOnClickListener(this);
        btnPhotoGraph.setOnClickListener(this);
        popupWindow.setTouchable(true);
        popupWindow.setBackgroundDrawable(null);
        popupWindow.setOutsideTouchable(true);
    }

    private void initView() {
        imgHead.setOnClickListener(this);
        imgBack.setOnClickListener(this);
        tvProxyMechanism.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_head:
                //popupWindow弹出时背景变暗 消失后背景还原
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(){
                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp=getWindow().getAttributes();
                        lp.alpha=1.0f;//FLAG_DIM_BEHND
                        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                        getWindow().setAttributes(lp);
                    }
                });
                popupWindow.showAtLocation(conPerInfo, Gravity.BOTTOM,0,0);
                WindowManager.LayoutParams lp=getWindow().getAttributes();
                lp.alpha=0.3f;
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                getWindow().setAttributes(lp);
                break;
            case R.id.btn_cancel:
                popupWindow.dismiss();
                break;
            case R.id.btn_photo:
                //打开相机
                break;
            case R.id.btn_photograph:
                //打开相册
                break;
            case R.id.tv_proxy_mechanism:
                startActivity(new Intent(this,ProxyMechanismActivity.class));
                break;
            case R.id.img_back:
                finish();
                break;
        }
    }
}