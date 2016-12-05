package com.example.zolta.petroltracker.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zolta.petroltracker.R;
import com.example.zolta.petroltracker.logic.PetrolTracker;

public class FillUpActivity extends Activity {

    private PetrolTracker ptr2;
    private EditText changeTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_up);
        ptr2 = PetrolTracker.getInstance();
        changeTxt = (EditText) findViewById(R.id.changetext);
        Button clickButton = (Button) findViewById(R.id.button2);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i= new Intent(FillUpActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        Button ptrask2 = (Button) findViewById(R.id.button4);
        ptrask2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                changeTxt.setText(ptr2.askFill());
            }
        });
    }
}
