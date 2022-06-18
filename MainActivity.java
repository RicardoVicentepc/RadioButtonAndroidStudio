package com.example.aulapam2403;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnPersonagem, btnSalario, btnLanchonete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnPersonagem = (Button) findViewById(R.id.btnPersonagem);
    btnSalario = (Button) findViewById(R.id.btnSalario);
    btnLanchonete = (Button) findViewById(R.id.btnLanchonete);
    btnSalario.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent tela = new Intent(MainActivity.this, CalcularSalario.class);
            startActivity(tela);
        }
    });
    btnPersonagem.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent tela = new Intent(MainActivity.this, Personagem.class);
            startActivity(tela);
        }
    });
    btnLanchonete.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent tela = new Intent(MainActivity.this, Lanche.class);
            startActivity(tela);
        }
    });
    }
}