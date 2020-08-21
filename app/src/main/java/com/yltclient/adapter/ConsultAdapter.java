package com.yltclient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.bean.Bean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ConsultAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<Bean> list;

    public ConsultAdapter(Context context, ArrayList<Bean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_news_rlv3, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.tvTitleRlvItme.setText(list.get(position).getTitle());
        viewHolder.tvTxt1RlvItem.setText(list.get(position).getTxt());
        viewHolder.tvTxt2RlvItem.setText(list.get(position).getTxt1());
        viewHolder.tvDateRlvItem.setText(list.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tv_title_rlv_itme)
        TextView tvTitleRlvItme;
        @BindView(R.id.tv_txt1_rlv_item)
        TextView tvTxt1RlvItem;
        @BindView(R.id.tv_txt2_rlv_item)
        TextView tvTxt2RlvItem;
        @BindView(R.id.tv_date_rlv_item)
        TextView tvDateRlvItem;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
