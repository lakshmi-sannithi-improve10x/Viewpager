package com.improve10x.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Switch;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
   private ViewPager2 whatsappVp;
  private   ViewpagerAdapter adapter;
  private TabLayout tabTl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setupAdapter();
        connectAdapter();
        setupTabWithViewpager();
    }

    private void setupTabWithViewpager() {
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabTl, whatsappVp, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 1:tab.setText("Status");
                    break;
                    case 2:tab.setText("Calls");
                    break;
                    case 0:
                    default:tab.setText("Chats");

                }
            }
        });
        tabLayoutMediator.attach();
    }

    private void connectAdapter() {
        whatsappVp.setAdapter(adapter);
    }

    private void setupAdapter() {
       adapter = new ViewpagerAdapter(this);
    }

    private void initViews() {
        whatsappVp = findViewById(R.id.whatsapp_vp);
        tabTl = findViewById(R.id.tab_tl);
    }
}