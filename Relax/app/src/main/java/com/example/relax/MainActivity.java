package com.example.relax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void goToMeditation(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity2_meditation.class);

        startActivity(intent);

    }
    public void goToAffirmation(View view){
        Intent intent = new Intent(getApplicationContext(),affirmations.class);
        startActivity(intent);

    }public void goToScribbling(View view){
        Intent intent = new Intent(getApplicationContext(),Scribbling.class);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}