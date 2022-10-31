package com.pab1.utspab_2024240105;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvNama;
    TextView tvNomor;
    TextView tvJalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS_M.Abdul Azizul Hakim");
        tvNama = findViewById(R.id.tv_nama);
        tvNomor = findViewById(R.id.tv_nomor);
        tvJalur = findViewById(R.id.tv_jalur);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yNomor = terima.getStringExtra("xNomor");
        String yJalur = terima.getStringExtra("xJalur");
        tvNama.setText(yNama);
        tvNomor.setText(yNomor);
        tvJalur.setText(yJalur);

    }
}