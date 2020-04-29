package com.example.tugasbesarlaundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void masukUser(View view) {
        Intent i = new Intent(MenuActivity.this, UserActivity.class);
        startActivity(i);
    }

    public void myOrder(View view) {
        Intent i = new Intent(MenuActivity.this, MyorderActivity.class);
        startActivity(i);
    }
    public void masukNotifikasi(View view) {
        Intent i = new Intent(MenuActivity.this, NotifikasiActivity.class);
        startActivity(i);
    }
    public void masukJadwal(View view) {
        Intent i = new Intent(MenuActivity.this, MyJadwalActivity.class);
        startActivity(i);
    }
    public void masukPembayaran(View view) {
        Intent i = new Intent(MenuActivity.this, ModePembayaranActivity.class);
        startActivity(i);
    }
    public void pesanan(View view) {
        Intent i = new Intent(MenuActivity.this, PesananActivity.class);
        startActivity(i);
    }
}
