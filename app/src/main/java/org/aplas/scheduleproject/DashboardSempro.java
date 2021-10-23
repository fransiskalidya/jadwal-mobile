package org.aplas.scheduleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DashboardSempro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_sempro);
        ImageButton syarat = findViewById(R.id.syaratImg);
        ImageButton mekanisme = findViewById(R.id.mekanismeImg);
        ImageButton daftar = findViewById(R.id.daftarImg);
        ImageView profile = findViewById(R.id.profile);
        Button skripsi = findViewById(R.id.skripsi);


        syarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardSempro.this, syarat.class));
            }
        });
        mekanisme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardSempro.this, mekanisme.class));
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardSempro.this, MainDaftarSidang.class));
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardSempro.this, MainProfile.class));
            }
        });
        skripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardSempro.this, Dashboard.class));
            }
        });
    }
}