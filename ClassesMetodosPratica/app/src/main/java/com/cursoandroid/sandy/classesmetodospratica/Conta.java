package com.cursoandroid.sandy.classesmetodospratica;

/*
Modificadores de acesso:
1) public       todas as classes terão acesso
2) private      pode ser acessado dentro da classe
3) protected    pode ser acessado dentro do mesmo pacote e/ou subclasses
4) default      permite o acesso dentro do pacote
 */

public class Conta {

    protected int numeroConta;
    private double saldo = 100;

    public double recuperarSaldo() {
        return this.saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
    }

}
