package com.example.recordinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewRecord extends AppCompatActivity {

    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        addBtn = (Button) findViewById(R.id.addR);

    }

    public void addRecord(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}