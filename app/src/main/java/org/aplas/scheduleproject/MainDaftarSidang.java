package org.aplas.scheduleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainDaftarSidang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_daftar_sidang);
    }

    public void moveToDashboard(View view) {
        Intent intent = new Intent(MainDaftarSidang.this, Dashboard.class);
        startActivity(intent);
    }
}