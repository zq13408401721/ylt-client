package com.yltclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.adapter.ConsultAdapter;
import com.yltclient.adapter.ConsultRlv1adapter;
import com.yltclient.adapter.ConsultRlv2Adapter;
import com.yltclient.bean.Bean;
import com.yltclient.bean.Rlv2Bean;
import com.yltclient.bean.Rlv3Bean;

import java.util.ArrayList;

public class ConsultFragment extends Fragment {
    private ArrayList<Bean> beans;
    private RecyclerView mRlvConsultXitong;
    private View inflate;
    private ArrayList<Rlv2Bean> rlv2Beans;
    private RecyclerView mRlvShiShi;
    private ConsultRlv1adapter consultRlv1adapter;
    private ArrayList<Rlv3Bean> rlv3Beans;
    private RecyclerView mRlvHangye;
    private ConsultRlv2Adapter consultRlv2Adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.fragment_consult, null);
        initView();
        return inflate;
    }

    private void initView() {
        mRlvConsultXitong = (RecyclerView) inflate.findViewById(R.id.rlv_consult_xitong);
        mRlvShiShi = inflate.findViewById(R.id.rlv_shishi_consult);
        mRlvHangye = inflate.findViewById(R.id.rlv_hangye);
        setRlv1();
        setRlv2();
        setRlv3();
    }

    private void setRlv3() {
        rlv3Beans = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Rlv3Bean rlv3Bean = new Rlv3Bean("比特币会不会被其他货币取代？专家竟然这样解释！", "2019.11.26 14:29:59", "http://ww1.sinaimg.cn/large/0065oQSqly1frjd4var2bj30k80q0dlf.jpg");
            rlv3Beans.add(rlv3Bean);
        }
        mRlvHangye.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRlvHangye.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayout.VERTICAL));
        consultRlv2Adapter = new ConsultRlv2Adapter(getActivity(), rlv3Beans);
        mRlvHangye.setAdapter(consultRlv2Adapter);
        consultRlv1adapter.notifyDataSetChanged();
    }

    private void setRlv2() {
        rlv2Beans = new ArrayList<>();
        Rlv2Bean rlv2Bean = new Rlv2Bean("BTC", "7486.42", "+2.78%");
        Rlv2Bean rlv2Bean1 = new Rlv2Bean("ETH", "7486.42", "+2.87%");
        Rlv2Bean rlv2Bean2 = new Rlv2Bean("XRP", "7486.42", "-2.78%");
        rlv2Beans.add(rlv2Bean);
        rlv2Beans.add(rlv2Bean1);
        rlv2Beans.add(rlv2Bean2);
        mRlvShiShi.setLayoutManager(new LinearLayoutManager(getActivity()));
        consultRlv1adapter = new ConsultRlv1adapter(getActivity(), rlv2Beans);
        mRlvShiShi.setAdapter(consultRlv1adapter);
        consultRlv1adapter.notifyDataSetChanged();
    }

    private void setRlv1() {
        beans = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Bean bean = new Bean("168云算力即将上线！", "168云算力正在开发中，预计将于11月26日上线。", "168云算力正在开发中，预计将于11月26日上线...", "2019.11.26 11:29:59");
            beans.add(bean);
        }
        mRlvConsultXitong.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRlvConsultXitong.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayout.VERTICAL));
        ConsultAdapter consultAdapter = new ConsultAdapter(getActivity(), beans);
        mRlvConsultXitong.setAdapter(consultAdapter);
        consultAdapter.notifyDataSetChanged();
    }
}
