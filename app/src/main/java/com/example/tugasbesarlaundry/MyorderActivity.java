package com.example.tugasbesarlaundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyorderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myorder);
    }
    public void antarLaundry(View view) {
        Intent i = new Intent(MyorderActivity.this, AntarActivity.class);
        startActivity(i);
    }
    public void ambilSendiri(View view) {
        Intent i = new Intent(MyorderActivity.this, AmbilActivity.class);
        startActivity(i);
    }
}
