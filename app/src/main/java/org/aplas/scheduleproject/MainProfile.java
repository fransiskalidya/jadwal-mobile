package org.aplas.scheduleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);
    }
    public void moveToChangePassword(View view) {
        Intent intent = new Intent(MainProfile.this, MainUbahPassword.class);
        startActivity(intent);
    }
}