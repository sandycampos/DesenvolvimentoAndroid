package com.cursoandroid.sandy.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // vou @Sobrescrever (@ sinaliza uma anotação)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        // System.out.println("selecionado pedra");
        this.opcaoSelecionada("pedra");
    }

    public void opcaoSelecionada(String opcaoSelecionada) {
        System.out.println("item clicado: " + opcaoSelecionada);
    }
}