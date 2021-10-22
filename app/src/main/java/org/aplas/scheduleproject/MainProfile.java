package org.aplas.scheduleproject;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainProfile extends Activity {
    public void moveToChangePassword(View view) {
        Intent intent = new Intent(MainProfile.this, MainUbahPassword.class);
        startActivity(intent);
    }
}
