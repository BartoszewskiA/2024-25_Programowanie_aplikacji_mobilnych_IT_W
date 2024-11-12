package com.example.w02p02;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText01, editText02;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editText01 = findViewById(R.id.editText01);
        editText02 = findViewById(R.id.editText02);
        textView = findViewById(R.id.textView01);
    }

    public void wylicz(View view) {
        Log.d("WYNIK", "Kliknięto przycisk Wylicz ");
//        int a = Integer.parseInt(editText01.getText().toString());
//        int b = Integer.parseInt(editText02.getText().toString());
        int a=0, b=0;
        try {
            a = Integer.parseInt(editText01.getText().toString());
        } catch (NumberFormatException e) {
            Log.e("WYNIK", "Wyjątek: " + e.getMessage());
            a = 0;
            editText01.setText("0");
        }
        try {
            b = Integer.parseInt(editText02.getText().toString());
        } catch (NumberFormatException e) {
            b = 0;
            editText02.setText("0");
        }


        int wynik = a + b;
        textView.setText(String.valueOf(wynik));
    }
}