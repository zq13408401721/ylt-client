package com.yltclient.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;


public class TitleBeHavior extends CoordinatorLayout.Behavior<View> {


    private float titleY;

    public TitleBeHavior(){

    }

    public TitleBeHavior(Context context, AttributeSet attrs){
        super(context,attrs);
    }

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        return dependency instanceof NestedScrollView;
    }

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        if(titleY == 0){
            titleY = dependency.getY()-child.getHeight();
        }
        float dy = dependency.getY()-child.getHeight();
        dy = dy < 0 ? 0 :dy;
        float alpha = 1 - (dy/titleY);
        child.setAlpha(alpha);
        return true;
    }
}
