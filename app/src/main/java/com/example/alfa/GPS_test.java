package com.example.alfa;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.MapView;

import kotlinx.coroutines.BuildersKt;


public class GPS_test extends AppCompatActivity {

    boolean isPermissionGranted;
    MapView mapView;
    private BuildersKt Dexter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps_test);

        checkMyPermission();
    }

    private void checkMyPermission() {
    }


}