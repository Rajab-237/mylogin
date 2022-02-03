package com.example.mylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                EditText us = findViewById(R.id.user);
                EditText pw = findViewById(R.id.pass);

                String username = us.getText().toString();
                String password = pw.getText().toString();


                Intent startIntent = new Intent(getApplicationContext(),Second_activity.class);
                startIntent.putExtra("com.example.mylogin.Rajab",username);
                startActivity(startIntent);

            }
        });
    }
}