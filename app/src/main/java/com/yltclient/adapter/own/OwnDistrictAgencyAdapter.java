package com.yltclient.adapter.own;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;

import java.util.ArrayList;
import java.util.List;

public class OwnDistrictAgencyAdapter extends RecyclerView.Adapter {
    private int PROVINCE = 0;
    private int CITY = 1;
    private Context context;
    private List<String> list = new ArrayList<>();
    private int type;

    public OwnDistrictAgencyAdapter(Context context) {
        this.context = context;
    }

    public void setList(List<String> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_agency_district, parent, false);
        return new AgencyHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        AgencyHolder agencyHolder = (AgencyHolder) holder;
        agencyHolder.tvProvince.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setType(int type) {
        this.type = type;
    }

    public interface OnClickListener{
        void onClickListener(int position);
    }

    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    private class AgencyHolder extends RecyclerView.ViewHolder {

        private TextView tvRequest;
        private TextView tvProvince;

        public AgencyHolder(View inflate) {
            super(inflate);
            tvProvince = inflate.findViewById(R.id.tv_province);
            tvRequest = inflate.findViewById(R.id.tv_request);
        }
    }
}
