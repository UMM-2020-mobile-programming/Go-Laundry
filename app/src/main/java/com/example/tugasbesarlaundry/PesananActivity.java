package com.example.tugasbesarlaundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PesananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
    }
    public void modebyr(View view) {
        Intent i = new Intent(PesananActivity.this, ModePembayaranActivity.class);
        startActivity(i);
    }
    public void masukmenu(View view) {
        Intent i = new Intent(PesananActivity.this, MenuActivity.class);
        startActivity(i);
    }
}
