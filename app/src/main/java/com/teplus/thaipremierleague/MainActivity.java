package com.teplus.thaipremierleague;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupToolbar();
        setupDrawerView();
        setupNavigationView();
    }

    private void setupNavigationView() {

        navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                Intent intentNav;
                switch (id) {
                    case R.id.nav_home:
                        intentNav = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intentNav);
                        break;
                    case R.id.nav_fixtures:
                        intentNav = new Intent(getApplicationContext(), FixtureActivity.class);
                        startActivity(intentNav);
                        break;
                    case R.id.nav_table:
                        intentNav = new Intent(getApplicationContext(), TableActivity.class);
                        startActivity(intentNav);
                        break;
                    case R.id.nav_top_scores:
                        intentNav = new Intent(getApplicationContext(), TopScorerActivity.class);
                        startActivity(intentNav);
                        break;
                    case R.id.nav_hilight:
                        intentNav = new Intent(getApplicationContext(), HilightActivity.class);
                        startActivity(intentNav);
                        break;

                }
                return false;
            }
        });

    }

    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Show menu icon
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
    }

    private void setupDrawerView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}