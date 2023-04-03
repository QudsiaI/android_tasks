package com.example.recordinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addRecord;
    Button show1;
    Button show2;
    Button show3;
    TextView Name;
    TextView Desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addRecord = (Button) findViewById(R.id.add);
        show1 = (Button) findViewById(R.id.show);
        show2 = (Button) findViewById(R.id.show2);
        show3 = (Button) findViewById(R.id.show3);
//        Name = (TextView) findViewById(R.id.rec1);
//        Desc = (TextView) findViewById(R.id.desc1);
    }

    public void addNewRecord(View v) {
        Intent i = new Intent(MainActivity.this, NewRecord.class);
        startActivity(i);
    }
    public void showRecord(View v) {
        Intent i = new Intent(MainActivity.this, ShowRecord.class);
        switch (v.getId()){
            case R.id.show:
                Name = (TextView) findViewById(R.id.rec1);
                Desc = (TextView) findViewById(R.id.desc1);
                i.putExtra("name",Name.getText().toString());
                i.putExtra("desc",Desc.getText().toString());
                break;
            case R.id.show2:
                Name = (TextView) findViewById(R.id.rec2);
                Desc = (TextView) findViewById(R.id.desc2);
                i.putExtra("name",Name.getText().toString());
                i.putExtra("desc",Desc.getText().toString());
                break;
            case R.id.show3:
                Name = (TextView) findViewById(R.id.rec3);
                Desc = (TextView) findViewById(R.id.desc3);
                i.putExtra("name",Name.getText().toString());
                i.putExtra("desc",Desc.getText().toString());
                break;
        }
        startActivity(i);
    }

}