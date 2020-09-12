package com.example.countontoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mTextview;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextview = findViewById(R.id.countval);
        if(savedInstanceState != null && savedInstanceState.containsKey("ap")){
            count = savedInstanceState.getInt("ap");
            mTextview.setText(String.valueOf(count));
        }
    }

    public void showToast(View view) {
        Toast.makeText(this, "Count is:"+mTextview.getText().toString(), Toast.LENGTH_SHORT).show();

    }
    public void showcount(View view){
        count++;
        mTextview.setText(String.valueOf(count));
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("ap",count);
    }
}

