package com.example.basiccurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double value, fvalue;

    public void click(View view){

        TextView editTextAmt=findViewById(R.id.editTextAmt);
         value = Double.parseDouble(editTextAmt.getText().toString());
         fvalue = value*74.17;
        String text = Double.toString(fvalue);
        Toast.makeText(this,text+" INR",Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}