package com.example.emotionperfume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FruityExplanation extends AppCompatActivity {
    String emotion;
    String aroma;
    String category;
    private Button btn_fruity_explanation_prev;
    private Button btn_fruity_explanation_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruity_explanation);
        emotion = getIntent().getStringExtra("Emotion");
        aroma = getIntent().getStringExtra("Aroma");
        category = getIntent().getStringExtra("Category");

        btn_fruity_explanation_prev = findViewById(R.id.btn_fruity_explanation_prev);
        btn_fruity_explanation_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruityExplanation.this , PerfumeChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                startActivity(intent); //액티비티 이동
            }
        });

        btn_fruity_explanation_next = findViewById(R.id.btn_fruity_explanation_next);
        btn_fruity_explanation_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FruityExplanation.this , JomaloneChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category",category);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}
