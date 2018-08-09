package com.dotslash.itcorner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class HomePage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private int[] imageIds = {R.drawable.short_term,
            R.drawable.short_term_diploma,
            R.drawable.advanced_diploma,
            R.drawable.digital_marketing};
    private String[] name = {"Short Term Course", "Job Oriented Diploma ", "Job Oriented Advanced Diploma", "digital Marketing"};
    GridView gvCourse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        hookUp();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_short_term_course) {
            // Handle the camera action
            startActivity(new Intent(this, ShortTermCourseActivity.class));
        } else if (id == R.id.nav_job_oriented_diploma) {
            startActivity(new Intent(this, ShortTermDiplomaActivity.class));

        } else if (id == R.id.nav_job_oriented_advanced_diploma) {
            startActivity(new Intent(this, AdvancedDiplomaActivity.class));

        } else if (id == R.id.nav_digital_marketing) {
            startActivity(new Intent(this, DigitalMarketingActivity.class));

        } else if (id == R.id.nav_about_us) {
            startActivity(new Intent(this , AboutUs.class));

        } else if (id == R.id.nav_placement) {
            startActivity(new Intent(this, Placement.class));

        } else if (id == R.id.nav_contact_us) {
            startActivity(new Intent(this ,ContactUs.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void hookUp(){
        gvCourse = (GridView) findViewById(R.id.gvCourse);
        CustomAdapter adapter = new CustomAdapter(this, name, imageIds);
        gvCourse.setAdapter(adapter);
    }
}
