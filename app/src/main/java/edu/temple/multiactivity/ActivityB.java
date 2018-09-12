package edu.temple.multiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTitle("Activity B");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_b);
    }
}
