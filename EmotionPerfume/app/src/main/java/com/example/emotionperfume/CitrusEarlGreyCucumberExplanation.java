package com.example.emotionperfume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CitrusEarlGreyCucumberExplanation extends AppCompatActivity {
    String emotion;
    String aroma;
    String category;
    String jomalone;
    private Button btn_earlgrey_and_cucumber_explanation_prev;
    private Button btn_earlgrey_and_cucumber_explanation_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citrus_earl_grey_cucumber_explanation);
        emotion = getIntent().getStringExtra("Emotion");
        aroma = getIntent().getStringExtra("Aroma");
        category = getIntent().getStringExtra("Category");
        jomalone = getIntent().getStringExtra("Jomalone");

        btn_earlgrey_and_cucumber_explanation_prev = findViewById(R.id.btn_earlgrey_and_cucumber_explanation_prev);
        btn_earlgrey_and_cucumber_explanation_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitrusEarlGreyCucumberExplanation.this , JomaloneChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category",category);
                startActivity(intent); //액티비티 이동
            }
        });

        btn_earlgrey_and_cucumber_explanation_next = findViewById(R.id.btn_earlgrey_and_cucumber_explanation_next);
        btn_earlgrey_and_cucumber_explanation_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitrusEarlGreyCucumberExplanation.this , EmotionPerfume.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category",category);
                intent.putExtra("Jomalone",jomalone);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
