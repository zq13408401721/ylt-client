package com.yltclient.ui.yun.yunapapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.yltclient.R;
import com.yltclient.ui.yun.yunutils.SystemUtils;

import java.util.List;

public class Adapter_Mine_Field extends RecyclerView.Adapter<Adapter_Mine_Field.ViewHolder> {
    private Context context;
    private List<Fragment> list;

    public Adapter_Mine_Field(Context context) {
        this.context = context;
    }

    public Adapter_Mine_Field(Context context, List<Fragment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.adapter_mine_field, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mineFieldTv.setText("\t\t\t\t"+"rvBeans.get(position).getName()");

        //设置头像的圆角
        int round = SystemUtils.px2Dp(context, 100);
        RoundedCorners roundedCorners = new RoundedCorners(round);
        RequestOptions options = RequestOptions.bitmapTransform(roundedCorners);
        Glide.with(context).load("https://tpcdn.whfpsoft.com/File/activity/20200727/c80d61031fc3673a5387ca84f188ebc2.jpg").apply(options).into(holder.mineFieldIv);
    }


    @Override
    public int getItemCount() {
        return 1;
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mineFieldIv;
        private TextView mineFieldTv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mineFieldIv = (ImageView) itemView.findViewById(R.id.mine_field_iv);
           mineFieldTv = (TextView) itemView.findViewById(R.id.mine_field_tv);

        }
    }
}
