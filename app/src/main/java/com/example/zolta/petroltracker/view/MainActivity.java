package com.example.zolta.petroltracker.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zolta.petroltracker.R;
import com.example.zolta.petroltracker.logic.PetrolTracker;

public class MainActivity extends Activity {

    private PetrolTracker ptr;
    private EditText changetext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ptr = PetrolTracker.getInstance();
        changetext = (EditText) findViewById(R.id.editText);
        Button clickButton = (Button) findViewById(R.id.button);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i= new Intent(MainActivity.this,FillUpActivity.class);
                startActivity(i);
            }
        });

        Button ptrask = (Button) findViewById(R.id.button3);
        ptrask.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                changetext.setText(ptr.askDriver());
            }
        });

        Button vehic = (Button) findViewById(R.id.button5);
        vehic.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                changetext.setText(ptr.askGps());
            }
        });

    }
}
