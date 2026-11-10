package br.com.alura.modelo;

import interfaces.Calculavel;

public class PrincipalPreco {
    public static void main(String[] args) {
        Calculavel l = new Livro();
        System.out.println(l.calcularPrecoFinal(500));
        Calculavel f = new ProdutoFisico();

        System.out.println(f.calcularPrecoFinal(500));
    }
}
