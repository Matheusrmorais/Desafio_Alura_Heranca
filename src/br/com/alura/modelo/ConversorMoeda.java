package br.com.alura.modelo;

import interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {


    private double cotacao;




    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * getCotacao();
    }
}
