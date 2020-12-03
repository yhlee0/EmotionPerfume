package com.example.emotionperfume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EmotionPerfume extends AppCompatActivity {
    String emotion;
    String aroma;
    String category;
    String jomalone;
    TextView t1;
    TextView t2;
    Button btn_emotion_perfume_retry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion_perfume);
        emotion = getIntent().getStringExtra("Emotion");
        aroma = getIntent().getStringExtra("Aroma");
        category = getIntent().getStringExtra("Category");
        jomalone = getIntent().getStringExtra("Jomalone");

        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        t1.setText(aroma);
        t2.setText(jomalone);

        btn_emotion_perfume_retry = findViewById(R.id.btn_emotion_perfume_retry);
        btn_emotion_perfume_retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionPerfume.this , JomaloneChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category",category);
                startActivity(intent);
            }
        });
    }
}
