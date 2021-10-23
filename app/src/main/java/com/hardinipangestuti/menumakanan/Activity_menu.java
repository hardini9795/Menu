package com.hardinipangestuti.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class menu extends AppCompatActivity {


    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2=(Button)findViewById(R.id.button);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new ItemSelectedListener());

    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

        //get strings of first item
        String firstItem = String.valueOf(spinner1.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))) {
// ToDo when first item is selected
            } else {
                Toast.makeText(parent.getContext(),
                        "Kamu telah memilih : " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();
// Todo when item is selected by the user
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg) {
// TODO Auto-generated method stub
            Intent i =new Intent(getApplicationContext(),menu.class);

            startActivity(i); }
    }
}