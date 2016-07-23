package com.example.sendtogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // this comment is to confirm that it works
        //this comment confirms the data update
        
        getActionBar();
    }
}
