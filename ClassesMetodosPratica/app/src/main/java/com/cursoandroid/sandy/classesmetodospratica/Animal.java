package com.cursoandroid.sandy.classesmetodospratica;

class Animal {

    int tamanho;
    String cor;
    double peso;

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
        System.out.println("Correr como um animal");
    }

}
