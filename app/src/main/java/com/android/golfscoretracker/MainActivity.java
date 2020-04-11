package com.android.golfscoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner parSelectorA = findViewById(R.id.parSelectorForPlayerA);
        Spinner parSelectorB = findViewById(R.id.parSelectorForPlayerB);

        final String[] par = {"3 Par", "4 Par", "5 Par"};

        ArrayAdapter<String> parList = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                par);

        parSelectorA.setAdapter(parList);
        parSelectorB.setAdapter(parList);

        parSelectorA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });






    }




}
