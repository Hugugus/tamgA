package com.example.tamg;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        //getActionBar().hide();
        getSupportActionBar().hide();
        Runnable r=new Runnable()
        {
            @Override
            public void run() {


                //HomeFragment.posts=posts;
                Intent mm= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mm);
                finish();
            }
        };
        new Handler().postDelayed(r,1000);
    }
}