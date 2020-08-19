package com.yltclient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.yltclient.R;
import com.yltclient.bean.Rlv3Bean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ConsultRlv2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<Rlv3Bean> list;

    public ConsultRlv2Adapter(Context context, ArrayList<Rlv3Bean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.rlv2_item, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.tvTitleRlv2Itme.setText(list.get(position).getTitle());
        viewHolder.tvDateRlv2Item.setText(list.get(position).getDate());
        Glide.with(context).load(list.get(position).getImage()).into(viewHolder.ivImg);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_title_rlv2_itme)
        TextView tvTitleRlv2Itme;
        @BindView(R.id.tv_date_rlv2_item)
        TextView tvDateRlv2Item;
        @BindView(R.id.iv_img)
        ImageView ivImg;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
