package org.aplas.scheduleproject;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainRegister extends Activity {
    public void moveToDashboard(View view) {
        Intent intent = new Intent(MainRegister.this, Dashboard.class);
        startActivity(intent);
    }
}
