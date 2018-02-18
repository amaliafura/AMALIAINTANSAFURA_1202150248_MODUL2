package com.example.android.amaliaintansafura_1202150248_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void radioClick1(View view) {
    }
    public void radioClick2(View view) {
    }


    public void pesan(View view) {
        RadioButton dine = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton take = (RadioButton) findViewById(R.id.radioButton2);

        if (dine.isChecked()) {
            Intent a = new Intent(this, Main3Activity.class);
            Toast.makeText(MainActivity.this, "Dine In",Toast.LENGTH_LONG).show();
            startActivity(a);
        }else if(take.isChecked()) {
            Intent ab = new Intent(this, Main2Activity.class);
            Toast.makeText(MainActivity.this, "Take Away",Toast.LENGTH_LONG).show();
            startActivity(ab);
        }
    }
}






