package com.example.jesusmartinez.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        //Appbar page filter
        Spinner cmbToolbar = (Spinner) findViewById(R.id.CmbToolbar);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getSupportActionBar().getThemedContext(),
                R.layout.support_simple_spinner_dropdown_item,
                new String[]{"Opción 1 ", "Opción 2 ", "Opción 3 "});

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        cmbToolbar.setAdapter(adapter);
    }
}
