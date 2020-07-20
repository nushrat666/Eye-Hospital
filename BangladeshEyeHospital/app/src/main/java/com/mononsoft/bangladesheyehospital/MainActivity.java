package com.mononsoft.bangladesheyehospital;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "MainActivity";

    private DrawerLayout drawer;
    private NavigationView navigationView;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle (this,drawer,toolbar,
                R.string.drawer_open,R.string.drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container,new MainFragment());
        transaction.commit();
    }

    private void initViews() {

        Log.d(TAG, "initViews: started");
        drawer = (DrawerLayout) findViewById(R.id.drawer);
        navigationView = (NavigationView) findViewById(R.id.navigationDrawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){


            case R.id.nav_login:
                Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
                //TODO: right the proper logic for different situations
                break;

            case R.id.nav_order:


                Intent intent= new Intent(getApplicationContext(),OrderActivity.class);
                startActivity(intent);

                break;

            case R.id.nav_appointment:
                Intent intent2= new Intent(getApplicationContext(),AppoinmentActivity.class);
                startActivity(intent2);
                break;

            case R.id.nav_doctors_profile:
                Toast.makeText(this, "Doctors Profile Selected", Toast.LENGTH_SHORT).show();
                //TODO: right the proper logic for different situations
                break;

            case R.id.nav_services:
                Intent intent3= new Intent(getApplicationContext(),ServiceActivity.class);
                startActivity(intent3);
                break;

            case R.id.nav_message:
                Intent intent8= new Intent(getApplicationContext(),Message.class);
                startActivity(intent8);
                break;
            case R.id.nav_branches:
                Toast.makeText(this, "Branches Selected", Toast.LENGTH_SHORT).show();
                //TODO: right the proper logic for different situations
                break;
            case R.id.nav_about:
                Intent intent1= new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_admin:
                Intent intent4= new Intent(getApplicationContext(),AdminActivity.class);
                startActivity(intent4);
                break;


            default:

                break;
        }

        return false;
    }
}
