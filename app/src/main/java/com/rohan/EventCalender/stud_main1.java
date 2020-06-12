package com.rohan.EventCalender;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class stud_main1 extends AppCompatActivity {

    //Defining Variables
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stud_main1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);
        bar.setHomeAsUpIndicator(R.mipmap.ic_menu_white_24dp);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        navigationView = (NavigationView) findViewById(R.id.n_view); //Initializing NavigationView

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()) {


                    //Replacing the main content with ContentFragment Which is our View;

                    case R.id.fragment0:
                        //Toast.makeText(getApplicationContext(), "Today Selected", Toast.LENGTH_SHORT).show();
                        Fragment0 fragment0 = new Fragment0();
                        android.support.v4.app.FragmentTransaction fragmentTransaction0 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction0.replace(R.id.container, fragment0);
                        fragmentTransaction0.commit();
                        setTitle("EventiVITy");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.fragment1:
                        //Toast.makeText(getApplicationContext(), "Today Selected", Toast.LENGTH_SHORT).show();
                        Fragment1 fragment1 = new Fragment1();
                        android.support.v4.app.FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.container, fragment1);
                        fragmentTransaction1.commit();
                        setTitle("Today");
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.fragment2:
                        // Toast.makeText(getApplicationContext(), "Upcoming Selected", Toast.LENGTH_SHORT).show();
                        Fragment2 fragment2 = new Fragment2();
                        android.support.v4.app.FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.container, fragment2);
                        fragmentTransaction2.commit();
                        setTitle("Upcoming");
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.fragment3:
                        //Toast.makeText(getApplicationContext(), "Clubs and Chapter Selected", Toast.LENGTH_SHORT).show();
                        Fragment3 fragment3 = new Fragment3();
                        android.support.v4.app.FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.container, fragment3);
                        fragmentTransaction3.commit();
                        setTitle("Clubs and Chapters");
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.fragment4:
                        //Toast.makeText(getApplicationContext(), "Online Classboard Selected", Toast.LENGTH_SHORT).show();
                        Fragment4 fragment4 = new Fragment4();
                        android.support.v4.app.FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction4.replace(R.id.container, fragment4);
                        fragmentTransaction4.commit();
                        setTitle("Online Classboard");
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.fragment5:
                        //Toast.makeText(getApplicationContext(), "About Us Selected", Toast.LENGTH_SHORT).show();
                        Fragment5 fragment5 = new Fragment5();
                        android.support.v4.app.FragmentTransaction fragmentTransaction5 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction5.replace(R.id.container, fragment5);
                        fragmentTransaction5.commit();
                        setTitle("About Us");
                        drawerLayout.closeDrawers();
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }
}