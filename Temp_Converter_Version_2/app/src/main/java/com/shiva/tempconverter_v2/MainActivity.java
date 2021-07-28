package com.shiva.tempconverter_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToCFC(View v){
        openCFC();
    }

    public void openCFC()
    {
        Intent intent1 = new Intent(this,CF_Converter.class);
        startActivity(intent1);
    }

    public void goToFCC(View v){
        openFCC();
    }

    public void openFCC()
    {
        Intent intent2 = new Intent(this,FC_Converter.class);
        startActivity(intent2);
    }
}