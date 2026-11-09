package br.com.alura.modelo;

public class Gato extends Animal {

    public void arranharMoveis(){
        System.out.println("Arranhando os moveis");
    }


    @Override
    public void emitirSom(){
        System.out.println("Mew mew");
    }


}
