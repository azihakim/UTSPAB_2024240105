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
    private EditText etNama, etNomor;
    private Spinner spJalur;
    private CheckBox cbKonfirmasi;
    private Button btnDaftar;

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
                                             String nama, nomor, jalur;
                                             int selectedID;

                                             nama = etNama.getText().toString();
                                             nomor = etNomor.getText().toString();
                                             jalur = spJalur.getSelectedItem().toString();

                                             if (nama.trim().equals("")){
                                                 etNama.setError("Nama Tidak Boleh Kosong");
                                             }
                                             else if (nomor.trim().equals("")){
                                                 etNomor.setError("Nomor Pendaftaran Tidak Boleh Kosong");
                                             }
                                             else {
//                                                 Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                                                 Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                                                 pindah.putExtra("xNama", nama);
                                                 startActivity(pindah);
                                             }
                                         }
                                     }
        );
    }
}