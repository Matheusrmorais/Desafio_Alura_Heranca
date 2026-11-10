package br.com.alura.modelo;

import interfaces.Calculavel;


public class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 1.05;
    }
}
