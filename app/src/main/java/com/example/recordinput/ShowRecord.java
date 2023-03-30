package com.example.recordinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowRecord extends AppCompatActivity {

    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_record);
        back = (Button) findViewById(R.id.button);
    }
    public void goBack(View v){
        Intent i=new Intent(ShowRecord.this, MainActivity.class);
        startActivity(i);
    }
}