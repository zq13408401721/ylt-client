package com.yltclient.common;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

public class GradientColorTextViewForManagerName extends androidx.appcompat.widget.AppCompatTextView {
    public GradientColorTextViewForManagerName(Context context) {
        super(context);
    }
 
    public GradientColorTextViewForManagerName(Context context,
                                               AttributeSet attrs) {
        super(context, attrs);
    }
    public GradientColorTextViewForManagerName(Context context,
                                               AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
 
    @Override
    protected void onLayout(boolean changed,
                            int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            getPaint().setShader(new LinearGradient(
                    0, 0, getWidth(), getHeight(),
                    new int[]{0xE83B3BBA, 0xE83FFBBA, 0xE83B3BBA}, new float[]{0, 0.5f, 1},
                    Shader.TileMode.CLAMP));
        }
    }
}