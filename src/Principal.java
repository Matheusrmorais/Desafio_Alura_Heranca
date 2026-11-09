import br.com.alura.modelo.ModeloCarro;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro m = new ModeloCarro();

        m.definirModelo("Porshe");
        m.definirPreco(540,530,480);
        m.exibirInfo();
    }
}
