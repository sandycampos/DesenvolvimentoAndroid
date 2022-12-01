package com.cursoandroid.sandy.classesmetodospratica.classes;

public class Animal {

    protected int tamanho;
    protected String cor;
    protected double peso;

    // Getters e Setters
    void setCor(String cor) {
        // Formatação ou Validação
        this.cor = cor;
    }

    String getCor() {
        return this.cor;
    }

    void dormir() {
        System.out.println("Dormir como um animal");
    }

    void correr() {
        System.out.println("Correr como um");
    }

}
