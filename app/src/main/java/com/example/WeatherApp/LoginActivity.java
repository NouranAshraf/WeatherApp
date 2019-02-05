package com.example.WeatherApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText Email;
        EditText Password;
        Button LogIn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       Email=  findViewById(R.id.Email);
       Password= findViewById(R.id.Password);
        LogIn= findViewById(R.id.Button);
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent= new Intent(LoginActivity.this,ListActivity.class);
                startActivity(Intent);


            }
        });

    }


}
