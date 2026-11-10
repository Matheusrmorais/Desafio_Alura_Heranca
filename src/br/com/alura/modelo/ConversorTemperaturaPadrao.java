package br.com.alura.modelo;

import interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double valor) {
        double resultado = (valor * 1.8) + 32;
        System.out.println("Fahrenheit: " + resultado);
        return resultado;
    }

    @Override
    public double fahrenheitParaCelsius(double valor) {
        double resultado = (valor - 32) / 1.8;
        System.out.println("Celsius: " + resultado);
        return resultado;

    }
}
