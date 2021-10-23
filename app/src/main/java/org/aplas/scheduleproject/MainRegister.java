package org.aplas.scheduleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);
    }
            public void moveToDashboard(View view) {
                Intent intent = new Intent(org.aplas.scheduleproject.MainRegister.this, Dashboard.class);
                startActivity(intent);
            }

    public void moveToChangePassword(View view) {
        Intent intent = new Intent(org.aplas.scheduleproject.MainRegister.this, MainUbahPassword.class);
        startActivity(intent);
    }
}
