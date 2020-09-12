package com.example.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etname,etpass,etemail;
SharedPreferences sp;
SharedPreferences.Editor edit;
String uname,upass,uemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = findViewById(R.id.name);
        etpass = findViewById(R.id.passowrd);
        etemail = findViewById(R.id.email);
        sp = getSharedPreferences("reg",MODE_PRIVATE);
    }

    public void onSubmit(View view) {
        uname = etname.getText().toString();
        upass = etpass.getText().toString();
        uemail = etemail.getText().toString();
        Intent i =new Intent(MainActivity.this,LoginActivity.class);
        i.putExtra("uName",uname);
        i.putExtra("uPass",upass);
        i.putExtra("uEmail",uemail);
        edit  = sp.edit();
        edit.putString("userName",uname);
        edit.putString("userPass",upass);
        edit.putString("userEmail",uemail);
        edit.apply();
        startActivity(i);
        //Toast.makeText(this, ""+uname+"\n"+upass+"\n"+uemail, Toast.LENGTH_SHORT).show();
    }
}