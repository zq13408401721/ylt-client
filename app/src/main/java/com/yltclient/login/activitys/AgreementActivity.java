package com.yltclient.login.activitys;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;
import com.yltclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AgreementActivity extends AppCompatActivity {

    @BindView(R.id.tv_progress)
    TextView tvProgress;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tv_agreement_content)
    TextView tvAgreementContent;
    @BindView(R.id.tv_bg)
    TextView tvBg;
    @BindView(R.id.appbar)
    AppBarLayout appbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        ButterKnife.bind(this);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.mipmap.common_icon_back_white);

        appbar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset == -1392) {
                    toolbar.setNavigationIcon(R.mipmap.icon_back_black);
                    toolbar.setBackgroundResource(R.drawable.shape_agreement_toolbar);
                } else {
                    toolbar.setNavigationIcon(R.mipmap.common_icon_back_white);
                    toolbar.setBackgroundResource(R.drawable.shape_agreement_toolbar);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}