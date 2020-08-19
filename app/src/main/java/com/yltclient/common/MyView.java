package com.yltclient.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {

    public static final int HEIGHT = 400;

    private Context context;

    public MyView(Context context) {
        super(context);
        initView(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context);
    }

    private Paint paint;
    private int h=HEIGHT;
    private int w;
    private LinearGradient linearGradient;

    private void initView(Context context){
        this.context = context;
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1);
        paint.setColor(Color.CYAN);

    }

    public void setW(int w){
        this.w = w;
        linearGradient = new LinearGradient(w,0,0,HEIGHT, new int[]{Color.parseColor("#FF30E123"), Color.parseColor("#FF599754")}, new float[]{0.5f, 1f}, Shader.TileMode.CLAMP);
        paint.setShader(linearGradient);
        invalidate();
    }
    public void setH(int h){
        this.h = h;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(0,0,w,200,paint);
        RectF oval = new RectF(0,HEIGHT-h,w,h);
        canvas.drawArc(oval,180,-180,false,paint);


    }
}
