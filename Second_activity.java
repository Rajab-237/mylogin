package com.example.mylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button prof = findViewById(R.id.cord);
        prof.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent nextIntent = new Intent(getApplicationContext(),Third_Activity.class);
                startActivity(nextIntent);
    
            }
        });

        if(getIntent().hasExtra("com.example.mylogin.Rajab")){
            TextView txt1 = findViewById(R.id.wel);
            TextView txt2 = findViewById(R.id.disp);
            String text = getIntent().getExtras().getString("com.example.mylogin.Rajab");
            txt2.setText(text);

        }

    }
}