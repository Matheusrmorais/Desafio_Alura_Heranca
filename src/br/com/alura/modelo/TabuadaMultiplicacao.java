package br.com.alura.modelo;

import interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int valor) {
        System.out.println("Tabuada do numero: " + valor);
        for (int i = 0; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " * " + i + " = " + resultado);
        }
    }
}
