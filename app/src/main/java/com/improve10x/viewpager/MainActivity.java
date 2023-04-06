package com.improve10x.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   private ViewPager2 whatsappVp;
  private   ViewpagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        whatsappVp.setAdapter(adapter);
    }

    private void setupAdapter() {
       adapter = new ViewpagerAdapter(this);
    }

    private void initViews() {
        whatsappVp = findViewById(R.id.whatsapp_vp);
    }
}