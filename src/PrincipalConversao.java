
import br.com.alura.modelo.ConversorMoeda;

public class PrincipalConversao  {
    public static void main(String[] args) {
        ConversorMoeda m = new ConversorMoeda();

        m.setCotacao(5);
        System.out.println("Convertendo dolar para reais: " + m.converterDolarParaReal(100));
    }

}
