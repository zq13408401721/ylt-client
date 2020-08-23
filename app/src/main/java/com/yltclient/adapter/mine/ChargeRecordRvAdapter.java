package com.yltclient.adapter.mine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;
import com.yltclient.bean.mine.ChargeRecordBean;

import java.util.List;

public class ChargeRecordRvAdapter extends RecyclerView.Adapter<ChargeRecordRvAdapter.ViewHolder> {
    Context context;
    List<ChargeRecordBean> list;

    public ChargeRecordRvAdapter(Context context, List<ChargeRecordBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.charge_record_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.time.setText("充币时间："+list.get(position).getChargeTime());
        holder.num.setText("充币数量："+list.get(position).getChargeNum());
        holder.state.setText("充币状态："+list.get(position).getChargeState());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView time;
        private TextView num;
        private TextView state;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            time=itemView.findViewById(R.id.tv_time);
            num=itemView.findViewById(R.id.tv_num);
            state=itemView.findViewById(R.id.tv_state);
        }
    }
}
