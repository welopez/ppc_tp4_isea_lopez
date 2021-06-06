package com.ppc_tp4_isea_lopez.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    private Button gopage1;
    private Button gopage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        gopage1 = (Button) findViewById(R.id.act3page1);
        gopage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity3.this, MainActivity.class);
                startActivity(i);
            }

        });

        gopage2 = (Button) findViewById(R.id.act3page2);
        gopage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity3.this, Activity2.class);
                startActivity(i);
            }

        });
    }
}