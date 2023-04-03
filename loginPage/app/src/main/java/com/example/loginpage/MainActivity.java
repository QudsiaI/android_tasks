package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText EmailInput;
    TextView EmailError;
    EditText Password;
    TextView PassError;
    Button Submit;
    Button Reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailInput = (EditText) findViewById(R.id.emailInput);
        EmailError = (TextView) findViewById(R.id.emailError);
        Password=(EditText) findViewById(R.id.password);
        PassError=(TextView) findViewById(R.id.passwordError);
        Submit=(Button) findViewById(R.id.SubmitBtn);
        Reset=(Button) findViewById(R.id.resetBtn);

        Submit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
            if (TextUtils.isEmpty(EmailInput.getText().toString()))
                EmailError.setText("Please Enter Email");
            else
                EmailError.setText("");

            if (TextUtils.isEmpty(Password.getText().toString()))
                PassError.setText("Please Enter Password");
            else
                PassError.setText("");

    }
    public void ClickReset(View v)
    {
        if(v.getId()==R.id.resetBtn) {
            EmailError.setText("");
            PassError.setText("");
            EmailInput.setText("");
            Password.setText("");
        }
    }
}