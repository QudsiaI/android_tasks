package com.example.recordinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowRecord extends AppCompatActivity {

    Button back;
    TextView Name;
    TextView Desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_record);
        back = (Button) findViewById(R.id.button);
        Name = (TextView) findViewById(R.id.rName);
        Desc = (TextView) findViewById(R.id.rDesc);
        Intent intent = getIntent();
        Name.setText(intent.getStringExtra("name"));
        Desc.setText(intent.getStringExtra("desc"));
    }

    public void goBack(View v) {
        Intent i = new Intent(ShowRecord.this, MainActivity.class);
        startActivity(i);
    }
}