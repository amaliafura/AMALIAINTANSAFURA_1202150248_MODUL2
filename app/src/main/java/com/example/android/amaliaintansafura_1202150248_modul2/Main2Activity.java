package com.example.android.amaliaintansafura_1202150248_modul2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take);
    }


    public void clickPilihPesan(View view) {
        Intent intent = new Intent(this, Main_Activity.class);
        startActivity(intent);
    }
}
