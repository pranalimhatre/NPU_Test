package com.example.pranali.npu;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.pranali.npu.Fragment.HomePageFragment;
import com.example.pranali.npu.Fragment.MapFragment;
import com.example.pranali.npu.Fragment.SocialFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class HomeActivity extends AppCompatActivity {

    BottomBar bottomBar;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.master_fragment);

        bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.bottom_menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if (menuItemId == R.id.bottom_bar_menu_home_menu_item_id){
                    HomePageFragment homePageFragment = new HomePageFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bottomBarFrameLayout, homePageFragment).commit();
                }
                else if (menuItemId == R.id.bottom_bar_menu_map_menu_item_id){
                    MapFragment mapFragment = new MapFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bottomBarFrameLayout, mapFragment).commit();
                }
                else if (menuItemId == R.id.bottom_bar_menu_social_menu_item_id){
                    SocialFragment socialFragment = new SocialFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bottomBarFrameLayout, socialFragment).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });
        // BottomNavigationMenu bt = (BottomNavigationView) findViewById(R.id.bottom_menu);

//toolbar= (Toolbar) findViewById(R.id.toolbar_main);
        // setSupportActionBar(toolbar);
        // ActionBar ab = getSupportActionBar();
        // ab.setDisplayHomeAsUpEnabled(true);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }*/

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent homeintent = new Intent(HomeActivity.this, NPUActivity.class);
        startActivity(homeintent);
        return true;
    }*/
}
