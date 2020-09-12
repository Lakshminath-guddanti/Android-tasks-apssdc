package com.example.switchtoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
TextView tt,ts;
ToggleButton togle;
Switch swi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tt = findViewById(R.id.ttv);
        ts = findViewById(R.id.stv);
        swi = findViewById(R.id.switchs);
        togle = findViewById(R.id.toggle);
        togle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) tt.setText("toogle is: On");
                else{
                    tt.setText("toggle is: Off");
                }
            }
        });
        swi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {
                if(ischecked){
                    ts.setText("Switch is: On");
                }
                else{
                    ts.setText("Switch is: Off");
                }
            }
        });
    }
}
