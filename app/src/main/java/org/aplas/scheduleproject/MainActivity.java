package org.aplas.scheduleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToSignIn(View view) {
        Intent intent = new Intent(MainActivity.this, MainRegister.class);
        startActivity(intent);
    }

    public void moveToDashboard(View view) {
        Intent intent = new Intent(MainActivity.this, Dashboard.class);
        startActivity(intent);
    }
}