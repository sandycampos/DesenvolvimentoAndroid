package com.cursoandroid.sandy.classesmetodospratica;

public class Funcionario {

    // Propriedades
    String nome;
    double salario;

    // Métodos sem/com retorno
    double recuperarSalario(double bonus, double descontoAdicional) {
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario + bonus - descontoAdicional;
        // System.out.println(this.salario);

    }
}
