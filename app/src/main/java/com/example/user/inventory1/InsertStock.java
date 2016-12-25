package com.example.user.inventory1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class InsertStock extends AppCompatActivity {

    private EditText mName,mNumber;
    private Spinner mSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_stock);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mName = (EditText)findViewById(R.id.name);
        mNumber = (EditText)findViewById(R.id.number);

        mSpinner = (Spinner)findViewById(R.id.types);

        setupSpinner();


    }

    private void setupSpinner(){
        ArrayAdapter mSpinnerAdapter = ArrayAdapter.createFromResource(this,R.array.spinner_item
        ,R.layout.support_simple_spinner_dropdown_item);
        mSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        mSpinner.setAdapter(mSpinnerAdapter);



    }


}
