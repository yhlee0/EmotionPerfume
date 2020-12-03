package com.example.emotionperfume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PerfumeChoice extends AppCompatActivity {

    private Button btn_floral;
    private Button btn_citrus;
    private Button btn_woody;
    private Button btn_fruity;
    private Button btn_spicy;
    private Button btn_light_floral;
    private ImageButton imgbtn_floral;
    private ImageButton imgbtn_citrus;
    private ImageButton imgbtn_woody;
    private ImageButton imgbtn_fruity;
    private ImageButton imgbtn_spicy;
    private ImageButton imgbtn_light_floral;
    private Button btn_previous_main;

    String emotion;
    String aroma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfume_choice);
        emotion = getIntent().getStringExtra("Emotion");
        aroma = getIntent().getStringExtra("Aroma");

        btn_floral = findViewById(R.id.btn_floral);
        btn_floral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , FloralExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Floral");
                startActivity(intent); //액티비티 이동
            }
        });


        btn_citrus = findViewById(R.id.btn_citrus);
        btn_citrus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , CitrusExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Citrus");
                startActivity(intent); //액티비티 이동
            }
        });


        btn_woody = findViewById(R.id.btn_woody);
        btn_woody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , WoodyExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Woody");
                startActivity(intent); //액티비티 이동
            }
        });


        btn_fruity = findViewById(R.id.btn_fruity);
        btn_fruity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , FruityExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Fruity");
                startActivity(intent); //액티비티 이동
            }
        });


        btn_spicy = findViewById(R.id.btn_spicy);
        btn_spicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , SpicyExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Spicy");
                startActivity(intent); //액티비티 이동
            }
        });


        btn_light_floral = findViewById(R.id.btn_light_floral);
        btn_light_floral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , LightFloralExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Light Floral");
                startActivity(intent); //액티비티 이동
            }
        });

        imgbtn_floral = findViewById(R.id.imgbtn_floral);
        imgbtn_floral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , FloralExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Floral");
                startActivity(intent); //액티비티 이동
            }
        });


        imgbtn_citrus = findViewById(R.id.imgbtn_citrus);
        imgbtn_citrus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , CitrusExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Citrus");
                startActivity(intent); //액티비티 이동
            }
        });


        imgbtn_woody = findViewById(R.id.imgbtn_woody);
        imgbtn_woody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , WoodyExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Woody");
                startActivity(intent); //액티비티 이동
            }
        });


        imgbtn_fruity = findViewById(R.id.imgbtn_fruity);
        imgbtn_fruity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , FruityExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Fruity");
                startActivity(intent); //액티비티 이동
            }
        });


        imgbtn_spicy = findViewById(R.id.imgbtn_spicy);
        imgbtn_spicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , SpicyExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Spicy");
                startActivity(intent); //액티비티 이동
            }
        });


        imgbtn_light_floral = findViewById(R.id.imgbtn_light_floral);
        imgbtn_light_floral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , LightFloralExplanation.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                intent.putExtra("Category","Light Floral");
                startActivity(intent); //액티비티 이동
            }
        });

        btn_previous_main = findViewById(R.id.btn_previous_main);
        btn_previous_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfumeChoice.this , EmotionCheck.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}
