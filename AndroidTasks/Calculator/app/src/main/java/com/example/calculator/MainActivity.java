package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView mtext;
EditText atext, btext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtext = findViewById(R.id.textVew);
        atext = findViewById(R.id.first);
        btext = findViewById(R.id.secound);
    }

    public void sumTwo(View view) {
        int a = Integer.parseInt(atext.getText().toString());
        int b = Integer.parseInt(btext.getText().toString());
        int c = a+b;
        mtext.setText("The Result is:"+c);
    }

    public void subTwo(View view) {
        int a = Integer.parseInt(atext.getText().toString());
        int b = Integer.parseInt(btext.getText().toString());
        int c = a-b;
        mtext.setText("The Result is:"+c);
    }

    public void mulTwo(View view) {
        int a = Integer.parseInt(atext.getText().toString());
        int b = Integer.parseInt(btext.getText().toString());
        int c = a*b;
        mtext.setText("The Result is:"+c);
    }

    public void divTwo(View view) {
        int a = Integer.parseInt(atext.getText().toString());
        int b = Integer.parseInt(btext.getText().toString());
        try{
            int c = a/b;
            mtext.setText("The Result is:"+c);
        }
        catch(Exception e){
            mtext.setText("Division is not possible as the den. value is 0");
        }
    }
}