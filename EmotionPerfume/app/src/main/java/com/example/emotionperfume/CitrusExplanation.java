package com.example.emotionperfume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CitrusExplanation extends AppCompatActivity {
    String emotion;
    String aroma;
    String category;
    private Button btn_citrus_explanation_prev;
    private Button btn_citrus_explanation_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citrus_explanation);
        emotion = getIntent().getStringExtra("Emotion");
        aroma = getIntent().getStringExtra("Aroma");
        category = getIntent().getStringExtra("Category");

        btn_citrus_explanation_prev = findViewById(R.id.btn_citrus_explanation_prev);
        btn_citrus_explanation_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitrusExplanation.this , PerfumeChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                startActivity(intent); //액티비티 이동
            }
        });

        btn_citrus_explanation_next = findViewById(R.id.btn_citrus_explanation_next);
        btn_citrus_explanation_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitrusExplanation.this , JomaloneChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category",category);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
