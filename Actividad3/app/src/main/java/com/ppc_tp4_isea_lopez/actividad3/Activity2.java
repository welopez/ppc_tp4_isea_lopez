package com.ppc_tp4_isea_lopez.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button gopage1;
    private Button gopage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        gopage1 = (Button) findViewById(R.id.act2page1);
        gopage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity2.this, MainActivity.class);
                startActivity(i);
            }

        });

        gopage3 = (Button) findViewById(R.id.act2page3);
        gopage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity2.this, Activity3.class);
                startActivity(i);
            }

        });
    }
}