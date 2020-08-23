package com.yltclient.adapter.mine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.bean.mine.IncomeDetailBean;

import java.util.List;

import butterknife.BindView;

public class IncomeDetailRvAdapter extends RecyclerView.Adapter<IncomeDetailRvAdapter.ViewHolder> {
    Context context;
    List<IncomeDetailBean> list;

    public IncomeDetailRvAdapter(Context context, List<IncomeDetailBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.mine_income_detail_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvDate.setText(list.get(position).getDate());
        holder.tvCoinNum.setText(list.get(position).getCoinNum()+" FileCoin");
        holder.tvType.setText(list.get(position).getType());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvType;
        private TextView tvDate;
        private TextView tvCoinNum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvType=itemView.findViewById(R.id.tv_type);
            tvDate=itemView.findViewById(R.id.tv_date);
            tvCoinNum=itemView.findViewById(R.id.tv_coinNum);

        }
    }
}
