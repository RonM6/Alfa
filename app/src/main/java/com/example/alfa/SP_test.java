package com.example.alfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SP_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_test);
        updateTV();

    }
    public void updateTV (){
        TextView textViewSP = (TextView) findViewById(R.id.tvsp);
        SharedPreferences settings=getSharedPreferences("prefs_name",MODE_PRIVATE);
        textViewSP.setText(settings.getString("et","-1").toString());
    }

    public void spTest(View view) {
        EditText ET = findViewById(R.id.etsp);
        SharedPreferences settings=getSharedPreferences("prefs_name",MODE_PRIVATE);
        SharedPreferences.Editor editor=settings.edit();
        editor.putString("et",ET.getText().toString());
        editor.commit();
        updateTV();

    }
}