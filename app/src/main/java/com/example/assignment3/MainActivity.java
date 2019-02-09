package com.example.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button buttonActivity2 = null;
private Button buttonActivity3 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttonActivity2 = (Button) findViewById(R.id.buttonActivity2);
        this.buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("testing button 2", "Button 2 fired");

            }
        });
        this.buttonActivity3 = (Button) findViewById(R.id.buttonActivity3);
        this.buttonActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("testing button 3", "Button 3 fired");
            }
        });
    }
}
