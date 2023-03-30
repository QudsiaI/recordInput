package com.example.recordinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addRecord;
    Button show1;
    Button show2;
    Button show3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addRecord = (Button) findViewById(R.id.add);
        show1 = (Button) findViewById(R.id.show);
        show2 = (Button) findViewById(R.id.show2);
        show3 = (Button) findViewById(R.id.show3);
    }
    public void addNewRecord(View v){
        Intent i=new Intent(MainActivity.this, NewRecord.class);
        startActivity(i);
    }
    public void showRecord(View v){
        Intent i=new Intent(MainActivity.this, ShowRecord.class);
        startActivity(i);
    }

}