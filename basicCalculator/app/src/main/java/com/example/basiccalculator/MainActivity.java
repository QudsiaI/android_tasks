package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    //Defining the Views
    EditText Num1;
    EditText Num2;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    TextView Result;
    TextView History;
    Button clearHistory;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Referring the Views
        Num1 = (EditText) findViewById(R.id.editText1);
        Num2 = (EditText) findViewById(R.id.editText2);
        Add = (Button) findViewById(R.id.Add);
        Sub = (Button) findViewById(R.id.Sub);
        Mul = (Button) findViewById(R.id.Mul);
        Div = (Button) findViewById(R.id.Div);
        Result = (TextView) findViewById(R.id.textView);
        History = (TextView) findViewById(R.id.textView2);
        clearHistory = (Button) findViewById(R.id.clear);

// set a listener
        Add.setOnClickListener(this);
        Sub.setOnClickListener(this);
        Mul.setOnClickListener(this);
        Div.setOnClickListener(this);
        clearHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        String history = new String();
        ArrayList<String> history = new ArrayList<String>();
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        String oper = "";
// check if the fields are empty
        if (TextUtils.isEmpty(Num1.getText().toString()) || TextUtils.isEmpty(Num2.getText().toString()))
            return;
// read EditText and fill variables with numbers
        num1 = Float.parseFloat(Num1.getText().toString());
        num2 = Float.parseFloat(Num2.getText().toString());
// defines the button that has been clicked and performs the corresponding operation
// write operation into oper, we will use it later for output
        switch (v.getId()) {
            case R.id.Add:
                oper = "+";
                result = num1 + num2;
                break;

            case R.id.Sub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.Mul:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.Div:
                oper = "/";
                result = num1 / num2;
                break;
            case R.id.clear:
                history.clear();
                break;
            default:
                break;
        }
// form the output line
        if (oper != "") {
            Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
            history.add(Result.getText().toString());
        }
        else{
            Result.setText("");
            History.setText("");
        }
        for (String i : history) {
            if (i != null) {
                History.append(i);
                History.append("\n");
            } else {
                History.setText("");
            }
        }

    }
}
