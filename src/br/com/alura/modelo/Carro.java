package br.com.alura.modelo;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPreco(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço primeiro ano: " + precoAno1);
        System.out.println("Preço segundo ano: " + precoAno2);
        System.out.println("Preço terceiro ano: " + precoAno3);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco(){
        double menorPreco = precoAno1;

        if (menorPreco > precoAno2){
            menorPreco =  precoAno2;
        }
        if (menorPreco > precoAno3){
            menorPreco =  precoAno3;
        }

        return menorPreco;
    }


    private double calcularMaiorPreco(){
        double maiorPreco = precoAno1;

        if (maiorPreco < precoAno2){
            maiorPreco =  precoAno2;
        }
        if (maiorPreco < precoAno3){
            maiorPreco =  precoAno3;
        }

        return maiorPreco;
    }


}
