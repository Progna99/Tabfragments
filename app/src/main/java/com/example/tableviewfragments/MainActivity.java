package com.example.tableviewfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private PagerAdaptercredit adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout) findViewById(R.id.tabview);
        viewPager=(ViewPager)findViewById(R.id.pager);
        adapter=new PagerAdaptercredit(getSupportFragmentManager());
        adapter.AddFragment(new Fragmentcredit(),"Credit Card");
        adapter.AddFragment(new FragmentDebit(),"Debit Card");
        adapter.AddFragment(new FragmentEwallet(),"E Wallet");
        adapter.AddFragment(new FragmentNetBank(),"Net banking");
        adapter.AddFragment(new FragmentUpi(),"UPI");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
