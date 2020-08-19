package com.yltclient;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;

public class IndexcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_index);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        navView.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_news, R.id.navigation_yun,R.id.navigation_mine,R.id.navigation_own)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                navController.navigate(item.getItemId());
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        item.setIcon(R.mipmap.ic_launcher);
                        return true;
                    case R.id.navigation_news:
                        item.setIcon(R.mipmap.ic_launcher);
                        return true;
                    case R.id.navigation_yun:
                        item.setIcon(R.mipmap.ic_launcher);
                        return true;
                    case R.id.navigation_mine:
                        item.setIcon(R.mipmap.ic_launcher);
                        return true;
                    case R.id.navigation_own:
                        item.setIcon(R.mipmap.ic_launcher);
                        return true;

                }
                return false;
            }
        });

    }
}
