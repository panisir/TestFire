package com.example.asus.healthprofiletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HealthProfileTestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_profile_test);

        final HealthProfile hp1=new HealthProfile(null,null,null,0,0,0,0,null,null,0.0,0.0, 0.0);
        final EditText nameET=(EditText)findViewById(R.id.NameET);
        final EditText surnameET= (EditText) findViewById(R.id.SurnameET);
        final EditText birthYearET= (EditText) findViewById(R.id.BirthYearET);
        final EditText weightET= (EditText) findViewById(R.id.WeightET);
        final EditText heightET= (EditText) findViewById(R.id.HeightET);
        final Intent displayIntent=new Intent(getApplicationContext(),DisplayActivity.class);




        Button denemeButton=(Button)findViewById(R.id.DenemeButton);

        denemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tName=nameET.getText().toString();
                hp1.setName(tName);
                String tSurname=surnameET.getText().toString();
                hp1.setSurname(tSurname);
                Integer tBirthYear= Integer.valueOf(birthYearET.getText().toString());
                hp1.setYear(tBirthYear);
                Double tWeight=Double.valueOf(weightET.getText().toString());
                hp1.setWeight(tWeight);
                Double tHeight=Double.valueOf(heightET.getText().toString());
                hp1.setHeight(tHeight);
                hp1.setAge();
                hp1.setBMI();
                hp1.setBmiProfile();
                hp1.setTargetHeartRate();
                displayIntent.putExtra("displayName", nameET.getText().toString());
                displayIntent.putExtra("displaySurname", surnameET.getText().toString());
                displayIntent.putExtra("displayAge", String.valueOf(hp1.getAge()));
                displayIntent.putExtra("displayBmiProfile", hp1.getBmiProfile());
                displayIntent.putExtra("displayHeartRate", hp1.getTargetHeartRate());




                startActivity(displayIntent);



            }
        });

    }//end method onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_health_profile_test, menu);
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

