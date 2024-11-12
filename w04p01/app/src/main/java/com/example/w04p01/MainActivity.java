package com.example.w04p01;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageView01;
    RadioGroup radioGroup01;
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
        imageView01=findViewById(R.id.imageWiew01);
        radioGroup01=findViewById(R.id.radioGroup01);

        radioGroup01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButton01)
                {
                    imageView01.setImageResource(R.drawable.obrazek01);
                    return;
                }
                if(checkedId==R.id.radioButton02)
                {
                    imageView01.setImageResource(R.drawable.obrazek02);
                    return;
                }
                if(checkedId==R.id.radioButton03)
                {
                    imageView01.setImageResource(R.drawable.obrazek03);
                    return;
                }
                if(checkedId==R.id.radioButton04)
                {
                    imageView01.setImageResource(R.drawable.obrazek04);
                }
            }
        });

    }
}