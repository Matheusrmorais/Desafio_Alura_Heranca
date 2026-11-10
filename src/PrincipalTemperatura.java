import br.com.alura.modelo.ConversorTemperaturaPadrao;
import interfaces.ConversorTemperatura;

public class PrincipalTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura c = new ConversorTemperaturaPadrao();
        c.celsiusParaFahrenheit(30);
        c.fahrenheitParaCelsius(102);
    }
}
