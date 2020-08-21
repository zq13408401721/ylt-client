package com.yltclient.ui.yun.yunfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.ui.yun.yunapapter.Adapter_Video_yun;

import butterknife.BindView;

public class Fragment_Video_yun extends Fragment {


    RecyclerView videoRv;
    private Adapter_Video_yun adapter_video_yun;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // https://tpcdn.whfpsoft.com:443/File/video/20200804/dd3176d4f1d9a0147d47ed028f2842b2.mp4
        View inflate = inflater.inflate(R.layout.fragment__video, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {

        videoRv = (RecyclerView) inflate.findViewById(R.id.video_rv);

        videoRv.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter_video_yun = new Adapter_Video_yun(getContext());
        videoRv.setAdapter(adapter_video_yun);
        adapter_video_yun.notifyDataSetChanged();
    }
}