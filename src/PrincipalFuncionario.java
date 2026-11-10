import br.com.alura.modelo.Desenvolvedor;
import br.com.alura.modelo.Funcionario;
import br.com.alura.modelo.Gerente;

public class PrincipalFuncionario {

    static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.trabalhar();
        Funcionario f1 = new Gerente();
        f1.trabalhar();
        Funcionario f2 = new Desenvolvedor();
        f2.trabalhar();
    }





}
