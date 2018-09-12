package edu.temple.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        //Set Title
        setTitle("Activity B");
        //Get Button B
        buttonB = findViewById(R.id.buttonB);
        //Set up Button B
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(ActivityB.this, ActivityA.class);
                startActivity(startActivityIntent);
            }
        });


    }
}
