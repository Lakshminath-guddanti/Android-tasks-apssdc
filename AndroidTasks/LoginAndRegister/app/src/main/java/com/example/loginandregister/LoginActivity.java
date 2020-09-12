package com.example.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText loguser,loguemail,logupass;
SharedPreferences sp;
String valname,valemail,valpass,v1,v2,v3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loguser = findViewById(R.id.logname);
        loguemail = findViewById(R.id.logemail);
        logupass = findViewById(R.id.logpass);
        sp = getSharedPreferences("reg",MODE_PRIVATE);
    }

    public void onLogin(View view) {
        v1 = loguser.getText().toString();
        v2 = loguemail.getText().toString();
        v3 = logupass.getText().toString();
        valname = sp.getString("userName","");
        valemail = sp.getString("userEmail","");
        valpass = sp.getString("userPass","");
        //Toast.makeText(this, ""+v1+"\n"+v2+"\n"+v3, Toast.LENGTH_SHORT).show();
        if((valname.equals(v1)) && (valemail.equals(v2)) && (valpass.equals(v3))){
            Toast.makeText(this, "SuccessFully Logged In", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "not Success", Toast.LENGTH_SHORT).show();
        }
    }
}