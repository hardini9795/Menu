package com.hardinipangestuti.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
// TODO Auto-generated method stub
                Intent i =new Intent(getApplicationContext(),menu.class);

                startActivity(i);
            }
        });
    }
}