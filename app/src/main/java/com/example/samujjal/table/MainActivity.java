package com.example.samujjal.table;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("My App Portfolio");

        Button btn = (Button)findViewById(R.id.btnSpotifyStreamer);
        btn.setOnClickListener(this);
        btn = (Button)findViewById(R.id.btnScoresApp);
        btn.setOnClickListener(this);
        btn = (Button)findViewById(R.id.btnLibraryApp);
        btn.setOnClickListener(this);
        btn = (Button)findViewById(R.id.btnBuildItBigger);
        btn.setOnClickListener(this);
        btn = (Button)findViewById(R.id.btnXYZReader);
        btn.setOnClickListener(this);
        btn = (Button)findViewById(R.id.btnCapstone);
        btn.setOnClickListener(this);   
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = null;

        switch (v.getId()){
            case R.id.btnSpotifyStreamer:
                toast = Toast.makeText(context, "Spotify Streamer Launcher", duration);
                toast.show();
                break;
            case R.id.btnScoresApp:
                toast = Toast.makeText(context, "Scores App Launcher", duration);
                toast.show();
                break;
            case R.id.btnLibraryApp:
                toast = Toast.makeText(context, "Library App Launcher", duration);
                toast.show();
                break;
            case R.id.btnBuildItBigger:
                toast = Toast.makeText(context, "Build It Bigger App Launcher", duration);
                toast.show();
                break;
            case R.id.btnXYZReader:
                toast = Toast.makeText(context, "XYZ Reader App Launcher", duration);
                toast.show();
                break;
            case R.id.btnCapstone:
                toast = Toast.makeText(context, "Capstone App Launcher", duration);
                toast.show();
                break;
            default:
                break;
        }
    }
}
