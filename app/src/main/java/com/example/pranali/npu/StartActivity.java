package com.example.pranali.npu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class StartActivity extends AppCompatActivity {
 private static int timeout =3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        new Handler().postDelayed(new Runnable()
          {
           @Override
           public void run()
           {
               Intent homeintent = new Intent(StartActivity.this,HomeActivity.class);
               startActivity(homeintent);
            }
           }
            ,timeout);
    }
}
