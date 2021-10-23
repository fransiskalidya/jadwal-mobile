package org.aplas.scheduleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainUbahPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ubah_password);
    }

    public void moveToProfile(View view) {
        Intent intent = new Intent(MainUbahPassword.this, MainProfile.class);
        startActivity(intent);
    }
}