// Exercício 9: Polimorfismo com Classes
// Objetivo: Demonstrar o polimorfismo usando classes.
// • Crie uma lista de objetos do tipo Pessoa.
// • Adicione objetos Pessoa e Estudante na lista.
// • Itere sobre a lista e chame o método exibirInformacoes para cada objeto, demonstrando o polimorfismo.

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa("João", 30);
        Estudante estudante = new Estudante("Maria", 20, "Engenharia");

        pessoas.add(pessoa);
        pessoas.add(estudante);

        for (Pessoa p : pessoas) {
            p.exibirInformacoes();
        }
    }
}
