package com.example.alfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    public void sp(View view) {
        startActivity(new Intent(this, SP_test.class));
        onPause();
    }

    public void gpsTest(View view) {
        startActivity(new Intent(this, GPS_test.class));
        onPause();
    }

    public void RTDTest(View view) {
        startActivity(new Intent(this, RTD_test.class));
        onPause();
    }
}