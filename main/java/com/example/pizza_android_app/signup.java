package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class signup extends AppCompatActivity {
Button Signup;
EditText username,password,email;
Spinner spin;
String data[]={"Male","Female","Other"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        Signup=(Button)findViewById(R.id.signup);
        spin=(Spinner)findViewById(R.id.spin);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);


        ArrayAdapter adapter=new ArrayAdapter(signup.this,android.R.layout.simple_list_item_1,data);
        spin.setAdapter(adapter);


        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();
                String mail = email.getText().toString();

                if (TextUtils.isEmpty(uname) && TextUtils.isEmpty(pass) && TextUtils.isEmpty(mail)) {
                    Toast.makeText(signup.this, "Invalid Field", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(signup.this, login.class);
                    startActivity(i);
                }
            }
        });
    }
}
