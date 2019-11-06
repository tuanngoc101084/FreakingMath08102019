package com.example.freakingmath08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random= new Random();
            int number = random.nextInt(6)+5;
            Toast.makeText(this, String.valueOf(number), Toast.LENGTH_SHORT).show();
    }
}
