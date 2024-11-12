package com.example.w02p01;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView01;
    int ile = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01 = findViewById(R.id.textView01);
//        textView01.setText("WItaj Świecie!");
    }

    public void dodaj_1(View view) {
        ile++;
        textView01.setText(Integer.toString(ile));
    }

    public void odejmij_1(View view) {
        ile--;
        textView01.setText(Integer.toString(ile));
    }
}