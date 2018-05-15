package com.mallamace.famlio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView catGrandfatherTxt = (TextView) findViewById(R.id.catGrandfatherTxt);
        catGrandfatherTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
                categoryIntent.putExtra("keyName",0);
                startActivity(categoryIntent);
            }
        });

        TextView catAshlynnTxt = (TextView) findViewById(R.id.catAshlynnTxt);
        catAshlynnTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
                categoryIntent.putExtra("keyName",1);
                startActivity(categoryIntent);
            }
        });


        TextView catNateTxt = (TextView) findViewById(R.id.catNateTxt);
        catNateTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
                categoryIntent.putExtra("keyName",2);
                startActivity(categoryIntent);
            }
        });



        TextView catRandomTxt = (TextView) findViewById(R.id.catRandomTxt);
        catRandomTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
                categoryIntent.putExtra("keyName",3);
                startActivity(categoryIntent);
            }
        });


        TextView catDibeneTxt = (TextView) findViewById(R.id.catDibeneTxt);
        catDibeneTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this, CategoryActivity.class);
                categoryIntent.putExtra("keyName",4);
                startActivity(categoryIntent);
            }
        });



    }
}
