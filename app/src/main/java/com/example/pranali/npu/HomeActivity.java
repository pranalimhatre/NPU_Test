package com.example.pranali.npu;

import android.content.Intent;
import android.support.design.internal.BottomNavigationMenu;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       // BottomNavigationMenu bt = (BottomNavigationView) findViewById(R.id.bottom_menu);

//toolbar= (Toolbar) findViewById(R.id.toolbar_main);
       // setSupportActionBar(toolbar);
       // ActionBar ab = getSupportActionBar();
       // ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent homeintent = new Intent(HomeActivity.this,NPUActivity.class);
        startActivity(homeintent);
        return true;
    }
}
