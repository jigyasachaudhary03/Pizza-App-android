package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        signup=(Button) findViewById(R.id.signup);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=username.getText().toString();
                String pass=password.getText().toString();
                if (TextUtils.isEmpty(uname)) {
                    username.setError("Invalid Field");
                }else if(TextUtils.isEmpty(pass)){
                    password.setError("Invalid Field");
                }
                else {
                    Intent i = new Intent(MainActivity.this, login.class);
                    startActivity(i);
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, signup.class);
                    startActivity(i);

            }
        });



    }
}
