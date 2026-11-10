package br.com.alura.modelo;

import interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double altura, double largura) {
        return altura*largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return (altura+largura)*2;
    }
}
