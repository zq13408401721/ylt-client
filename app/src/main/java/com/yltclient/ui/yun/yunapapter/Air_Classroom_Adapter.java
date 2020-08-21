package com.yltclient.ui.yun.yunapapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yltclient.R;

import java.util.List;

public class Air_Classroom_Adapter extends RecyclerView.Adapter<Air_Classroom_Adapter.ViewHolder> {

    private Context context;
    private List list;

    public Air_Classroom_Adapter(Context context) {
        this.context = context;
    }

    public Air_Classroom_Adapter(Context context, List list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Air_Classroom_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.air_classroom_adapter, parent, false);
        return new Air_Classroom_Adapter.ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Air_Classroom_Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
