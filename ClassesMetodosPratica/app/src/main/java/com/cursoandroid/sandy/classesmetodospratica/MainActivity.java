package com.cursoandroid.sandy.classesmetodospratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cursoandroid.sandy.classesmetodospratica.classes.Animal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Conta conta = new Conta();

        Animal animal = new Animal();

        // conta.depositar(150); // 250
        // conta.sacar(100); // 150

        // System.out.println(conta.recuperarSaldo());

        // conta.saldo = 0;
        // System.out.println(conta.saldo);

        /*
        Passaro passaro = new Passaro();
        passaro.correr();
        passaro.dormir();
        passaro.voar();

        Cao cao = new Cao();
        cao.correr();
        cao.dormir();
        cao.latir();
        cao.setCor("Azul");
        System.out.println(cao.getCor());

        Animal animal = new Animal();
        animal.correr();
        */

        /*
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sandy";
        funcionario.salario = 1000;
        double salarioRecuperado = funcionario.recuperarSalario(150, 20);
        System.out.println("O salário é: " + salarioRecuperado);
        */

        /*
        int numero = 10;
        Casa minhaCasa = new Casa();
        minhaCasa.cor = "Azul";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();

        Casa minhaCasa2;
        minhaCasa2 = new Casa();
        minhaCasa2.cor = "Branca";
        */
    }
}