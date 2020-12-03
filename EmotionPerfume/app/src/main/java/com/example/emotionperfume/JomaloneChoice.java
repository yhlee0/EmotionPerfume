package com.example.emotionperfume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.File;

public class JomaloneChoice extends AppCompatActivity {

    static String [] list1 = {"basil \nand neroli", "earlgrey \nand cucumber", "grapefruit", "lime basil \nand mandarin"};
    static String [] list2 = {"honeysuckle\nand davana","mimosa \nand cardamom","orange blossom","peony \nand blush suede"};
    static String [] list3 = {"blackberry \nand bay","english pear \nand freesia","nectarine blossom \nand honey"};
    static String [] list4 = {"poppy \nand barley","red roses","wild bluebell"};
    static String [] list5 = {"amber \nand lavender","english oak \nand hazelnut"};
    static String [] list6 = {"black cedarwood \nand juniper","154","pomegranate noir","woodsage \nand sea salt"};
    static TextView t1;
    static ImageButton img1;
    static ImageButton img2;
    static ImageButton img3;
    static ImageButton img4;
    static Button btn1;
    static Button btn2;
    static Button btn3;
    static Button btn4;
    static Button btn_jomalone_choice_prev;
    String emotion;
    String aroma;
    String category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jomalone_choice);

        emotion = getIntent().getStringExtra("Emotion");
        aroma = getIntent().getStringExtra("Aroma");
        category = getIntent().getStringExtra("Category");
        //find Object
        t1 = findViewById(R.id.textView1);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        btn1 = findViewById(R.id.btn1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn_jomalone_choice_prev = findViewById(R.id.btn_jomalone_choice_prev);

        btn_jomalone_choice_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JomaloneChoice.this, PerfumeChoice.class);
                intent.putExtra("Emotion",emotion);
                intent.putExtra("Aroma",aroma);
                startActivity(intent);
            }
        });
        //set Object
        if(category.equals("Citrus")) {
            t1.setText("Citrus");
            img1.setImageResource(R.drawable.basil_and_neroli);
            btn1.setText(list1[0]);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , CitrusBasilNeroliExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn1.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img2.setImageResource(R.drawable.earlgrey_and_cucumber);
            btn2.setText(list1[1]);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , CitrusEarlGreyCucumberExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn2.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img3.setImageResource(R.drawable.grapefruit);
            btn3.setText(list1[2]);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , CitrusGrapefruitExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn3.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img4.setImageResource(R.drawable.lime_basil_and_mandarin);
            btn4.setText(list1[3]);
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , CitrusLimeBasilMandarinExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn4.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

        }else if(category.equals("Floral")) {
            t1.setText("Floral");
            img1.setImageResource(R.drawable.honeysuckle_and_davana);
            btn1.setText(list2[0]);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , FloralHoneysuckleDavanaExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn1.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img2.setImageResource(R.drawable.mimosa_and_cardamom);
            btn2.setText(list2[1]);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , FloralMimosaCardamomExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn2.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img3.setImageResource(R.drawable.orange_blossom);
            btn3.setText(list2[2]);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , FloralOrangeBlossomExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn3.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img4.setImageResource(R.drawable.peony_and_blush_suede);
            btn4.setText(list2[3]);
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , FloralPeonyBlushSuedeExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn4.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

        }else if(category.equals("Fruity")) {
            t1.setText("Fruity");
            img1.setImageResource(R.drawable.blackberry_and_bay);
            btn1.setText(list3[0]);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , FruityBlackberryBayExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn1.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img2.setImageResource(R.drawable.english_pear_and_freesia);
            btn2.setText(list3[1]);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , FruityEnglishPearFreesiaExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn2.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img3.setImageResource(R.drawable.nectarine_blossom_and_honey);
            btn3.setText(list3[2]);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , FruityNectarineBlossomHoneyExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn3.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

        }else if(category.equals("Light Floral")) {
            t1.setText("Light Floral");
            img1.setImageResource(R.drawable.poppy_and_barley);
            btn1.setText(list4[0]);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , LightFloralPoppyBarleyExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn1.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img2.setImageResource(R.drawable.red_roses);
            btn2.setText(list4[1]);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , LightFloralRedRosesExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn2.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img3.setImageResource(R.drawable.wild_bluebell);
            btn3.setText(list4[2]);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , LightFloralWildBluebellExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn3.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

        }else if(category.equals("Spicy")) {
            t1.setText("Spicy");
            img1.setImageResource(R.drawable.amber_and_lavender);
            btn1.setText(list5[0]);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , SpicyAmberLavenderExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn1.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img2.setImageResource(R.drawable.english_oak_and_hazelnut);
            btn2.setText(list5[1]);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , SpicyEnglishOakHazelnutExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn2.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

        }else if(category.equals("Woody")) {
            t1.setText("Woody");
            img1.setImageResource(R.drawable.black_cedarwood_and_juniper);
            btn1.setText(list6[0]);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , WoodyBlackCedarwoodJuniperExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn1.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img2.setImageResource(R.drawable.onefivefour);
            btn2.setText(list6[1]);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , WoodyOneFiveFourExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn2.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img3.setImageResource(R.drawable.pomegranate_noir);
            btn3.setText(list6[2]);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , WoodyPomegranateNoirExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn3.getText());
                    startActivity(intent); //액티비티 이동
                }
            });

            img4.setImageResource(R.drawable.woodsage_and_sea_salt);
            btn4.setText(list6[3]);
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(JomaloneChoice.this , WoodyWoodSageSeaSaltExplanation.class);
                    intent.putExtra("Emotion",emotion);
                    intent.putExtra("Aroma",aroma);
                    intent.putExtra("Category",category);
                    intent.putExtra("Jomalone",btn4.getText());
                    startActivity(intent); //액티비티 이동
                }
            });
        }
    }
}
