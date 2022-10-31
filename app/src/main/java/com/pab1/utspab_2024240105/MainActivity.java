package com.pab1.utspab_2024240105;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etNomor;
    Spinner spJalur;
    CheckBox cbKonfirmasi;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_nama);
        etNomor = findViewById(R.id.et_nomor);
        spJalur = findViewById(R.id.sp_jalur);
        cbKonfirmasi = findViewById(R.id.cb_konfirmasi);
        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             String nama = etNama.getText().toString();
                                             String nomor = etNomor.getText().toString();
                                             String jalur = spJalur.getSelectedItem().toString();

                                             if (nama.trim().equals("")){
                                                 etNama.setError("Nama Tidak Boleh Kosong");
                                             }
                                             else if (nomor.trim().equals("")) {
                                                 etNomor.setError("Nomor Pendaftaran Tidak Boleh Kosong");
                                             }
                                             else if (jalur.trim().equals("Jalur Pendaftaran")) {
                                                 Toast.makeText(MainActivity.this, "Pilih jalur pendaftaran", Toast.LENGTH_SHORT).show();
                                             }
                                             else if (!(cbKonfirmasi.isChecked())){
                                                 Toast.makeText(MainActivity.this, "Konfirmasi Daftar!!!", Toast.LENGTH_SHORT).show();
                                             }
                                             else {
                                                 Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                                                 pindah.putExtra("xNama", nama);
                                                 pindah.putExtra("xNomor", nomor);
                                                 pindah.putExtra("xJalur", jalur);
                                                 startActivity(pindah);
                                             }
                                         }
                                     }
        );
    }
}