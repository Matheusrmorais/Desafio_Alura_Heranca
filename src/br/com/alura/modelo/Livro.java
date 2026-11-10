package br.com.alura.modelo;

import interfaces.Calculavel;

public class Livro implements Calculavel {
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 0.9;
    }
}
