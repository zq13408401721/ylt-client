package com.yltclient.ui.own;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yltclient.R;
import com.yltclient.ui.own.activities.BusinessSchoolActivity;
import com.yltclient.ui.own.activities.InviteFriendsActivity;
import com.yltclient.ui.own.activities.MyPromotionActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class OwnFragment extends Fragment implements View.OnClickListener {

    private Unbinder unbinder;
    @BindView(R.id.img_head)
    ImageView imgHead;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_temporary)
    TextView tvTemporary;
    @BindView(R.id.img_wallet)
    ImageView imgWallet;
    @BindView(R.id.tv_wallet)
    TextView tvWallet;
    @BindView(R.id.img_delivery_address)
    ImageView imgDeliveryAddress;
    @BindView(R.id.tv_delivery_address)
    TextView tvDeliveryAddress;
    @BindView(R.id.img_security_center)
    ImageView imgSecurityCenter;
    @BindView(R.id.tv_security_center)
    TextView tvSecurityCenter;
    @BindView(R.id.img_invite_friends_into)
    ImageView imgInviteFriendsInto;
    @BindView(R.id.img_my_promotion_into)
    ImageView imgMyPromotionInto;
    @BindView(R.id.img_business_school_into)
    ImageView imgBussinessSchoolInto;
    @BindView(R.id.img_integral_into)
    ImageView imgIntergralInto;
    @BindView(R.id.img_about_us_into)
    ImageView imgAboutUsInto;


    public OwnFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_owns, container, false);
        unbinder = ButterKnife.bind(this,inflate);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        imgInviteFriendsInto.setOnClickListener(this);
        imgMyPromotionInto.setOnClickListener(this);
        imgBussinessSchoolInto.setOnClickListener(this);
        imgIntergralInto.setOnClickListener(this);
        imgAboutUsInto.setOnClickListener(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_invite_friends_into:
                startActivity(new Intent(getContext(), InviteFriendsActivity.class));
                break;
            case R.id.img_my_promotion_into:
                startActivity(new Intent(getContext(), MyPromotionActivity.class));
                break;
            case R.id.img_business_school_into:
                startActivity(new Intent(getContext(), BusinessSchoolActivity.class));
                break;
            case R.id.img_integral_into:
                break;
            case R.id.img_about_us_into:
                break;
        }
    }
}
