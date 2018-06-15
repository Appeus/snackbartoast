package com.example.snackbartoast;

import android.os.Bundle;
import android.provider.Settings;
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
import android.widget.Button;
import android.widget.Toast;

public class Snackbartoast extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    protected Button Nappi;
    String string1 = "Tämä on paahtoleipä";
    Button txtbtn;
    int Global_mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


   /* Nappi = (Button)findViewById(R.id.Nappi);
        Nappi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            }
        });
*/

         txtbtn = (Button) findViewById(R.id.Nappi);
        txtbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Global_mode ==1){
                    Toast.makeText(getApplicationContext(), string1, Toast.LENGTH_LONG).show();
                } else if (Global_mode == 2) {
                    Snackbar.make(view, "Tämä on välipalapatukka", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }

        });




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
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
        getMenuInflater().inflate(R.menu.snackbartoast, menu);
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

        int id = item.getItemId();


        if (id == R.id.nav_creator) {
            Global_mode = 1;

        } else if (id == R.id.nav_play) {
            Global_mode = 2;
        }


      /*  if (Global_mode ==1){
            Toast.makeText(getApplicationContext(), string1, Toast.LENGTH_LONG).show();
        }
        else if (Global_mode ==2){
            View v = this.findViewById(R.id.mainlayout);
            Snackbar.make(v, "Tämä on välipalapatukka",Snackbar.LENGTH_LONG);

        }  */




       DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}




/* if (global_mode ==1){
        Toast.makeText..
        } else if (global_mode==2){
    Snackbar.makeText
        } */





  /*switch(id){
            case R.id.nav_creator:

                break;
            case R.id.nav_play:

                break;
        }*/




   /* txtbtn = (Button) findViewById(R.id.Nappi);
        txtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Tämä on välipalapatukka",Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();
            }
        });     */