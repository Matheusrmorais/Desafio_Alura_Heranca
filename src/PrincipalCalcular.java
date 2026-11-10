import br.com.alura.modelo.CalculadoraSalaRetangular;

public class PrincipalCalcular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular c = new CalculadoraSalaRetangular();

        System.out.println("Calculando a área: " + c.calcularArea(1.20,1.50));
        System.out.println("Calculando o perimetro: " + c.calcularPerimetro(1.20,1.50));
    }
}
