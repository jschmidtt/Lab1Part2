package edu.temple.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    Button buttonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        //Set Title
        setTitle("Activity A");
        //Find button A
        buttonA = findViewById(R.id.buttonA);
        //Set up button A
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(ActivityA.this, ActivityB.class);
                startActivity(startActivityIntent);
            }
        });
    }
}
