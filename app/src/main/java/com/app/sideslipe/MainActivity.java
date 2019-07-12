package com.app.sideslipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.qiantao.coordinatormenu.CoordinatorMenu;

public class MainActivity extends AppCompatActivity {
    private ImageView mHeadIv;
    private ImageView ivMilk;
    private CoordinatorMenu mCoordinatorMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHeadIv = findViewById(R.id.iv_head);
        ivMilk = findViewById(R.id.iv_milk);
        mCoordinatorMenu =  findViewById(R.id.menu);
        mHeadIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCoordinatorMenu.isOpened()) {
                    mCoordinatorMenu.closeMenu();
                } else {
                    mCoordinatorMenu.openMenu();
                }
            }
        });
        ivMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCoordinatorMenu.isOpened()) {
                    mCoordinatorMenu.closeMenu();
                } else {
                    mCoordinatorMenu.openMenu();
                }
            }
        });
    }
}
