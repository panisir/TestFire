package com.example.asus.healthprofiletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.jar.Attributes;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        //HealthProfileTestActivity hpt1=new HealthProfileTestActivity();

        TextView dName= (TextView) findViewById(R.id.nameTV);
        TextView dSurname= (TextView) findViewById(R.id.surnameTV);
        TextView dAge= (TextView) findViewById(R.id.ageTV);
        TextView dBmi= (TextView) findViewById(R.id.bmiTV);
        TextView dHeartRate= (TextView) findViewById(R.id.heartrateTV);

        dName.setText("Your Name:"+getIntent().getExtras().getString("displayName"));
        dSurname.setText(" "+getIntent().getExtras().getString("displaySurname"));
        dAge.setText("Your Age:"+getIntent().getExtras().getString("displayAge"));
        dBmi.setText("Bmi Index:"+getIntent().getExtras().getString("displayBmiProfile"));
        dHeartRate.setText("Heart Rate:"+getIntent().getExtras().getString("displayHeartRate"));














    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display, menu);
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
}
