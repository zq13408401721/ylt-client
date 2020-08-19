package com.yltclient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.bean.Rlv2Bean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ConsultRlv1adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<Rlv2Bean> list;

    public ConsultRlv1adapter(Context context, ArrayList<Rlv2Bean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.rlv1_item, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.tvTxt1Rlv1Item.setText(list.get(position).getName());
        viewHolder.tvTxt2Rlv1Item.setText(list.get(position).getZhang());
        viewHolder.tvTxt3Rlv1Item.setText(list.get(position).getDie());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_txt1_rlv1_item)
        TextView tvTxt1Rlv1Item;
        @BindView(R.id.tv_txt2_rlv1_item)
        TextView tvTxt2Rlv1Item;
        @BindView(R.id.tv_txt3_rlv1_item)
        TextView tvTxt3Rlv1Item;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
