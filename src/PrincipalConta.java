import br.com.alura.modelo.ContaBancaria;
import br.com.alura.modelo.ContaCorrente;

public class PrincipalConta {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(2500);
        conta.consultarSaldo();

        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(500);
        conta2.cobrarTarifaMensal();
        conta2.consultarSaldo();
        conta2.sacar(100);
        conta2.consultarSaldo();
        conta2.sacar(900);
        conta2.consultarSaldo();

    }


}
