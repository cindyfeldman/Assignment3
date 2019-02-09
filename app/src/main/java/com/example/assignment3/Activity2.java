package com.example.assignment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
private Button buttonHome = null;
private Button buttonThree = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        this.buttonHome = (Button)findViewById(R.id.buttonHome);
        this.buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                Intent intent = new Intent(Activity2.this, com.example.assignment3.MainActivity.class);
                startActivity(intent);
                Log.d("Testing button 2", "Button 2 Fired");
            }


        });
        this.buttonThree = (Button)findViewById(R.id.button2);
        this.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, com.example.assignment3.Activity3.class);
                startActivity(intent);
            }
        });

    }
}
