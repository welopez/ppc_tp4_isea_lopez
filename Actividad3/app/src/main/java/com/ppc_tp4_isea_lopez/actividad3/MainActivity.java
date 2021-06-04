package com.ppc_tp4_isea_lopez.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText personName;
    private EditText postalAddress;
    private EditText phoneText;
    private EditText password;
    private EditText email;
    private Button sendTexts;
    private Button gopage1;
    private Button gopage2;
    private Button gopage3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personName = (EditText) findViewById(R.id.personName);
        postalAddress = (EditText)findViewById(R.id.postalAddress);
        phoneText = (EditText) findViewById(R.id.phoneText);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);


    }
}