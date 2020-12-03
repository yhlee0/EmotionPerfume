package com.example.emotionperfume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EmotionCheck extends AppCompatActivity {
    String emotion;
    String aroma;
    TextView t1;
    TextView t2;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion_check);
        emotion = getIntent().getStringExtra("Emotion");
        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        btn1 = findViewById(R.id.btn_emotion_check_retry);
        btn2 = findViewById(R.id.btn_emotion_check_next);

        if(emotion.equals("Happiness")||emotion.equals("행복")) {
            emotion = "행복";
            aroma = "로즈마리";
        }
        else if(emotion.equals("Sadness")||emotion.equals("우울")){
            emotion = "우울";
            aroma = "티트리";
        }
        else if(emotion.equals("Disgust")||emotion.equals("역겨움")){
            emotion = "역겨움";
            aroma = "라임";
        }
        else if(emotion.equals("Fear")||emotion.equals("두려움")){
            emotion = "두려움";
            aroma = "샌달우드";
        }
        else if(emotion.equals("Surprise")||emotion.equals("놀람")){
            emotion = "놀람";
            aroma = "라벤더";
        }
        else if(emotion.equals("Anger")||emotion.equals("화남")){
            emotion = "화남";
            aroma = "네놀리";
        }
        t1.setText(emotion);
        t2.setText(aroma);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionCheck.this,EmotionMeasurement.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionCheck.this, PerfumeChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                startActivity(intent);
            }
        });
    }
}
