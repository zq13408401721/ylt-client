package com.yltclient.login.activitys;

import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import com.yltclient.R;
import com.yltclient.common.MyView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AgreementActivity extends AppCompatActivity {

    @BindView(R.id.myView)
    MyView myView;
    @BindView(R.id.scrollView)
    NestedScrollView scrollView;
    @BindView(R.id.img_agreement_back)
    ImageView imgAgreementBack;
    private int height = MyView.HEIGHT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int width = ((WindowManager) this.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();
        setContentView(R.layout.activity_agreement);
        ButterKnife.bind(this);
        myView.setW(width);
        myView.setH(height);
        scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                height = (int) (MyView.HEIGHT - 0.4 * scrollY);
                myView.setH(height);
            }
        });

    }

    @OnClick(R.id.img_agreement_back)
    public void onViewClicked() {
        finish();
    }
}