package com.cursoandroid.sandy.classesmetodospratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Passaro passaro = new Passaro();
        passaro.correr();
        passaro.dormir();
        passaro.voar();*/

        Cao cao = new Cao();
        cao.dormir();
        cao.latir();

        cao.setCor("Azul");
        System.out.println(cao.getCor());

        /*Animal animal = new Animal();
        animal.correr();*/

        /*Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sandy";
        funcionario.salario = 1000;
        double salarioRecuperado = funcionario.recuperarSalario(150, 20);
        System.out.println("O salário é: " + salarioRecuperado);*/

        // int numero = 10;
        /* Casa minhaCasa = new Casa();
        minhaCasa.cor = "Azul";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();

        // Casa minhaCasa2;
        // minhaCasa2 = new Casa();
        // minhaCasa2.cor = "Branca"; */
    }
}