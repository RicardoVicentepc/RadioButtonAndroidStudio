package com.example.aulapam2403;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class CalcularSalario extends AppCompatActivity {
    RadioButton rbPorc10, rbPorc15, rbPorc20;
    EditText etName, etSalario;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_salario);
        rbPorc10 = (RadioButton) findViewById(R.id.rbPorc10);
        rbPorc15 = (RadioButton) findViewById(R.id.rbPorc15);
        rbPorc20 = (RadioButton) findViewById(R.id.rbPorc20);
        etName = (EditText) findViewById(R.id.etName);
        etSalario = (EditText) findViewById(R.id.etSalario);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mensagem = new AlertDialog.Builder(CalcularSalario.this);
                double salarioTotal, salario, calPorc;
                String nome = String.format(etName.getText().toString());
                salario = Double.parseDouble(etSalario.getText().toString()); //Reverter String em int
                if(rbPorc10.isChecked() == true){
                    calPorc = (10 * salario) / 100; // Calcular porcentagem
                    salarioTotal = salario + calPorc; //Calcular salario com o reajuste
                    mensagem.setTitle("Dados do usuario");
                 mensagem.setMessage("Nome : " + nome+ "\nSalario : " + salario +
                         "\nFaixa de Reajuste : 10%\n10% de " + salario +" : " + calPorc +
                         "\nSalario Reajustado : " + salarioTotal);
                 mensagem.setNegativeButton("Sair", null);
                 mensagem.show();
                }else if(rbPorc15.isChecked() == true) {
                    calPorc = (15 * salario) / 100;
                    salarioTotal = salario + calPorc;
                    mensagem.setTitle("Dados do usuario");
                    mensagem.setMessage("Nome : " + nome + "\nSalario : " + salario +
                            "\nFaixa de Reajuste : 15%\n15% de " + salario + " : " + calPorc +
                            "\nSalario Reajustado : " + salarioTotal);
                    mensagem.setNegativeButton("Sair", null);
                    mensagem.show();
                }else if(rbPorc20.isChecked() == true){
                    calPorc = (20 * salario) / 100;
                    salarioTotal = salario + calPorc;
                    mensagem.setTitle("Dados do usuario");
                    mensagem.setMessage("Nome : " + nome + "\nSalario : " + salario +
                            "\nFaixa de Reajuste : 20%\n20% de " + salario +" : " + calPorc +
                            "\nSalario Reajustado : " +salarioTotal);
                    mensagem.setNegativeButton("Sair", null);
                    mensagem.show();
                }
            }
        });

    }
}