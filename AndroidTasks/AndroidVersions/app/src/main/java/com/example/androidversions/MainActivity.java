package com.example.androidversions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rcycle;
int aVersionsimg[];
String title[],version[],rel_date[];
Versiontable vtable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcycle = findViewById(R.id.recycler);
        title=getResources().getStringArray(R.array.title);
        version=getResources().getStringArray(R.array.version);
        rel_date=getResources().getStringArray(R.array.releasedate);
        aVersionsimg = new int[]{
                R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,
                R.drawable.a5,
                R.drawable.a6,
                R.drawable.a7,
                R.drawable.a8,
                R.drawable.a9,
                R.drawable.a10,
                R.drawable.a11,
                R.drawable.a12,
                R.drawable.a13,
                R.drawable.a14,
                R.drawable.a15,
                R.drawable.a16,
                R.drawable.a17,
                R.drawable.a18,
        };
        vtable = new Versiontable(this,title,version,rel_date,aVersionsimg);
        rcycle.setLayoutManager(new LinearLayoutManager(this));
        rcycle.setAdapter(vtable);
    }
}