package com.satman.satya.runtimepermissions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EntrenceActivity extends AppCompatActivity implements View.OnClickListener {


    Button bsingle, bmultiple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrence);


        bsingle = (Button) findViewById(R.id.bsingle);
        bmultiple = (Button) findViewById(R.id.bmultiple);


        bsingle.setOnClickListener(this);
        bmultiple.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId()== R.id.bsingle){

            startActivity(new Intent(getApplicationContext(), StorageActivity.class));

        } else if (view.getId() == R.id.bmultiple){


            startActivity(new Intent(getApplicationContext(), MultiplePermissionsActivity.class));

        }
    }
}
