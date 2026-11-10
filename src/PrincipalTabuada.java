import br.com.alura.modelo.TabuadaMultiplicacao;
import interfaces.Tabuada;

public class PrincipalTabuada {
    public static void main(String[] args) {
        Tabuada tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);
    }
}
