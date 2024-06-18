// Exercício 8: Polimorfismo com Interfaces
// Objetivo: Demonstrar o polimorfismo usando a interface Trabalhador.
// • Crie uma classe Empresa com um método adicionarTrabalhador que receba um objeto do tipo Trabalhador.
// • No método adicionarTrabalhador, chame o método trabalhar.
// • Crie objetos de Funcionario e Gerente e adicione-os à empresa, demonstrando o polimorfismo.

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Trabalhador> trabalhadores = new ArrayList<>();

    public void adicionarTrabalhador(Trabalhador trabalhador) {
        trabalhadores.add(trabalhador);
        trabalhador.trabalhar();
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario funcionario = new Funcionario(3000, "TI");
        Gerente gerente = new Gerente(5000, "RH", 1000);

        empresa.adicionarTrabalhador(funcionario);
        empresa.adicionarTrabalhador(gerente);
    }
}
