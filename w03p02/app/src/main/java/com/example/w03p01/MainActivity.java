package com.example.w03p01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1, button2, button3;

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

        textView = findViewById(R.id.textView01);
        button1 = findViewById(R.id.button01);
        button2 = findViewById(R.id.button02);
        button3 = findViewById(R.id.button03);

        dodaj_sluchacze_zdarzen();
    }

    private void dodaj_sluchacze_zdarzen() {
        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ID = v.getId();
                if(ID == R.id.button01)
                {
                    textView.setText("Kliknięto przycisk 1");
                    return;
                }
                if(ID == R.id.button02)
                {
                    textView.setText("Kliknięto przycisk 2");
                    return;
                }
                if(ID == R.id.button03)
                {
                    textView.setText("Kliknięto przycisk 3");
                    return;
                }

            }
        };

        button1.setOnClickListener(sluchacz);
        button2.setOnClickListener(sluchacz);
        button3.setOnClickListener(sluchacz);
    }
}