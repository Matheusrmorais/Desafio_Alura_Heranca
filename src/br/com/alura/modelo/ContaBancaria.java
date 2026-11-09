package br.com.alura.modelo;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido");
        } else {
            this.saldo += valor;
            System.out.println("Saldo Atualizado: " + saldo);
        }

    }
    public void sacar(double valor){
        if (valor > saldo || valor <= 0){
            System.out.println("Saldo insuficiente ou valor inválido");
        } else {
            this.saldo -= valor;
            System.out.println("Saldo atual: " + this.saldo);
        }

    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }


}
