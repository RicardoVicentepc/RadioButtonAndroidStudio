package com.example.aulapam2403;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Lanche extends AppCompatActivity {
    RadioButton rbCoxinha,rbPastel,rbPizza,rbRefrigerante,rbSuco,rbAgua;
    Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanche);
        rbCoxinha = (RadioButton) findViewById(R.id.rbCoxinha);
        rbAgua = (RadioButton) findViewById(R.id.rbAgua);
        rbPastel = (RadioButton) findViewById(R.id.rbPastel);
        rbPizza = (RadioButton) findViewById(R.id.rbPizza);
        rbRefrigerante = (RadioButton) findViewById(R.id.rbRefrigerante);
        rbSuco = (RadioButton) findViewById(R.id.rbSuco);
        btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double coxinha=4.50;
                double pastel = 8.00;
                double pcPizza = 6.00;
                double refrigerante = 5.00;
                double suco = 7.00;
                double agua = 7.50;
                double totalComanda;
                AlertDialog.Builder msg = new AlertDialog.Builder(Lanche.this);
                if(rbCoxinha.isChecked() == true && rbRefrigerante.isChecked() == true){
                    totalComanda = coxinha + refrigerante;
                    msg.setTitle("Comanda");
                    msg.setMessage("Coxinha : R$" + coxinha + "\nRefrigerante : R$" + refrigerante + "\nTotal a pagar : R$" + totalComanda);
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }else if(rbCoxinha.isChecked() == true && rbAgua.isChecked() == true){
                    totalComanda = coxinha + agua;
                    msg.setTitle("Comanda");
                    msg.setMessage("Coxinha : R$"+coxinha+"\nÁgua: R$"+agua+"\nTotal a pagar : R$" + totalComanda);
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }else if(rbCoxinha.isChecked() == true && rbSuco.isChecked() == true){
                    totalComanda = coxinha + suco;
                    msg.setTitle("Comanda");
                    msg.setMessage("Coxinha : R$" + coxinha +"\nSuco : R$"+ suco + "\nTotal a pagar : R$" + totalComanda );
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }else if(rbPastel.isChecked() == true && rbRefrigerante.isChecked() == true){
                    totalComanda = pastel + refrigerante;
                    msg.setTitle("Comanda");
                    msg.setMessage("Pastel : R$" + pastel + "\nRefrigerante : R$"+refrigerante +"\nTotal a pagar : R$"+ totalComanda);
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }else if(rbPastel.isChecked() == true && rbAgua.isChecked() == true){
                    totalComanda = pastel + agua;
                    msg.setTitle("Comanda");
                    msg.setMessage("Pastel : R$" + pastel + "\nÁgua : R$"+agua+"\nTotal a pagar : R$"+totalComanda);
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }else if(rbPastel.isChecked() == true && rbSuco.isChecked() == true){
                    totalComanda = pastel + suco;
                    msg.setTitle("Comanda");
                    msg.setMessage("Pastel : R$" + pastel + "\nSuco : R$"+suco+"\nTotal a pagar : R$"+totalComanda);
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }else if(rbPizza.isChecked() == true && rbRefrigerante.isChecked() == true){
                    totalComanda = pcPizza + refrigerante;
                    msg.setTitle("Comanda");
                    msg.setMessage("Pedaço De Pizza : R$" + pcPizza + "\nRefrigerante : R$"+refrigerante+"\nTotal a pagar : R$"+totalComanda);
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }else if(rbPizza.isChecked() == true && rbSuco.isChecked() == true){
                    totalComanda = pcPizza + suco;
                    msg.setTitle("Comanda");
                    msg.setMessage("Pedaço De Pizza : R$" + pcPizza +"\nSuco : R$"+suco+"\nTotal a pagar : R$"+totalComanda);
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }else if(rbPizza.isChecked() == true && rbAgua.isChecked() == true){
                    totalComanda = pcPizza + agua;
                    msg.setTitle("Comanda");
                    msg.setMessage("Pedaço De Pizza : R$"+pcPizza + "\nÁgua : R$"+agua+"\nTotal a pagar : R$"+totalComanda);
                    msg.setNegativeButton("fechar", null);
                    msg.show();
                }
            }
        });
    }
}