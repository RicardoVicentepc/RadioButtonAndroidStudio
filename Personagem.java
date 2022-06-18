package com.example.aulapam2403;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Personagem extends AppCompatActivity {

    RadioButton rbEustacio, rbKatz, rbMuriel,rbCoragem;
    Button btnGerar;
    ImageView imagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);
        rbEustacio = (RadioButton) findViewById(R.id.rbEustacio);
        rbKatz = (RadioButton) findViewById(R.id.rbKatz);
        rbMuriel = (RadioButton) findViewById(R.id.rbMuriel);
        rbCoragem = (RadioButton) findViewById(R.id.rbCoragem);
        btnGerar = (Button) findViewById(R.id.btnGerar);
        imagem = (ImageView) findViewById(R.id.imagem);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbEustacio.isChecked() == true){
                    imagem.setImageResource(R.drawable.img1);
                }else if(rbMuriel.isChecked() == true){
                    imagem.setImageResource(R.drawable.img2);
                }else if(rbKatz.isChecked() == true){
                    imagem.setImageResource(R.drawable.img4);
                }else{
                    imagem.setImageResource(R.drawable.img3);
                }
            }
        });
    }
}