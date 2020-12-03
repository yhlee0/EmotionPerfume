package com.example.emotionperfume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WoodyPomegranateNoirExplanation extends AppCompatActivity {
    String emotion;
    String aroma;
    String category;
    String jomalone;
    private Button btn_pomegranate_noir_explanation_prev;
    private Button btn_pomegranate_noir_explanation_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woody_pomegranate_noir_explanation);
        emotion = getIntent().getStringExtra("Emotion");
        aroma = getIntent().getStringExtra("Aroma");
        category = getIntent().getStringExtra("Category");
        jomalone = getIntent().getStringExtra("Jomalone");

        btn_pomegranate_noir_explanation_prev = findViewById(R.id.btn_pomegranate_noir_explanation_prev);
        btn_pomegranate_noir_explanation_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WoodyPomegranateNoirExplanation.this , JomaloneChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category",category);
                startActivity(intent); //액티비티 이동
            }
        });

        btn_pomegranate_noir_explanation_next = findViewById(R.id.btn_pomegranate_noir_explanation_next);
        btn_pomegranate_noir_explanation_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WoodyPomegranateNoirExplanation.this , EmotionPerfume.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category",category);
                intent.putExtra("Jomalone",jomalone);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
