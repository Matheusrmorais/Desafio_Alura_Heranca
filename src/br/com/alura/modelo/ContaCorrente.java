package br.com.alura.modelo;

public class ContaCorrente extends ContaBancaria{
    double tarifa = 0.5;

    public void cobrarTarifaMensal(){


        sacar(tarifa);

    }

}
