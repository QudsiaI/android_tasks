package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageButton;
import 	android.net.Uri;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btn;
    ImageButton search;
    EditText Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.buttonActivity1);
        search = (ImageButton) findViewById(R.id.imageButton);
        Text = (EditText) findViewById(R.id.editText1);

        btn.setOnClickListener(this);
        search.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String url;

        url = Text.getText().toString();
        switch (v.getId()) {
            case R.id.buttonActivity1:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.imageButton:
                if (TextUtils.isEmpty(Text.getText().toString()))
                {
                    return;
                }
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(in);
                break;
            default:
                break;
        }
    }
}