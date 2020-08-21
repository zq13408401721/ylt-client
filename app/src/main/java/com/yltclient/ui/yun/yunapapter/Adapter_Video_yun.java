package com.yltclient.ui.yun.yunapapter;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.yltclient.R;

import cn.jzvd.JZVideoPlayer;
import cn.jzvd.JZVideoPlayerStandard;

public class Adapter_Video_yun extends RecyclerView.Adapter<Adapter_Video_yun.ViewHolder> {
    private Context context;

    public Adapter_Video_yun(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.adapter_video, parent, false);
        return new ViewHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        JZVideoPlayer.setVideoImageDisplayType(JZVideoPlayer.VIDEO_IMAGE_DISPLAY_TYPE_FILL_PARENT);
        holder.mJC.thumbImageView.setScaleType(ImageView.ScaleType.FIT_XY);

        holder.mJC.TOOL_BAR_EXIST = false;
        holder.mJC.setUp("http://ssb-video.oss-cn-qingdao.aliyuncs.com/Video_1003_20161027140007.mp4"
                , JZVideoPlayerStandard.SCROLL_AXIS_HORIZONTAL, "这视频真好，去除黑边了");
        Glide.with(context).load("http://p0.so.qhmsg.com/bdr/_240_/t01c10808f98a39bd4f.jpg")
                .into(holder.mJC.thumbImageView);

        holder.mJC.widthRatio = 4;
        holder.mJC.heightRatio = 3;
        JZVideoPlayer.FULLSCREEN_ORIENTATION = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;  //横向
        JZVideoPlayer.NORMAL_ORIENTATION = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT;  //纵向





    }


/*    @Override
    public void onBackPressed() {
        if (JZVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }*/


    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private JZVideoPlayerStandard mJC;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mJC=itemView.findViewById(R.id.mJC);
        }
    }
}
