import br.com.alura.modelo.Animal;
import br.com.alura.modelo.Cachorro;
import br.com.alura.modelo.Gato;

public class PrincipalAnimal {

    public static void main(String[] args) {

        Gato gato = new Gato();

        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();
        cachorro.abanarRabo();

    }
}
